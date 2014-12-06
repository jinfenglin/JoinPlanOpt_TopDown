package opt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.RuntimeErrorException;

import logicalPlanTable.LogicalPlanTable;
import logicalPlanTable.LogicalPlanTableRow;
import main.ParserAndTranslator;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import QueryParser.QueryLexer;
import QueryParser.QueryParser;

public class TopDownOpt {
	Information_table Itable;//Global table for register
	static LogicalPlanTable logTable;
	int count=7;
	public TopDownOpt()
	{
		Itable=new Information_table();
		ParserAndTranslator PAT=new ParserAndTranslator();
		String query = PAT.queryFileLoader();
		ANTLRStringStream in = new ANTLRStringStream(query);
    	QueryLexer lexer = new QueryLexer(in);
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParser parser = new QueryParser(tokens);
        parser.logPlanTable = new LogicalPlanTable();
        try {
			parser.query();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        logTable = parser.logPlanTable;
        
	}
	/**
	 * Regist an entry in to the table. The entry's ID will be assigned as the index.
	 * @param entry
	 */
	public int regist(Entry entry)
	{
		return Itable.add_entry(entry);
	}
	/**
	 * 
	 * @param csg
	 * @return
	 * true if not exceed parent's upper bounder else return false
	 */
	public float SQLSERVER_EVALUATE(String SQL)//FIX ME
	{
		float estimation=1;
		List<Float> list=new ArrayList<Float>();
		list.add((float) 1.0);
		list.add((float) 2.0);
		list.add((float) 3.0);
		list.add((float) 4.0);
		list.add((float) 5.0);
		list.add((float) 6.0);
		list.add((float) 7.0);
		list.add((float) 8.0);
		list.add((float) 9.0);
		float num=list.get(count);
		count+=1;
		count%=9;
		
		return num;
	}
	/**
	 * It will check the join oder of each subcsg and return 2 possible join order
	 * @param a pair of subcsg
	 * @return
	 * a list of all possible join order
	 */
	public List<String> MakeJoinOrder(pairCSG pair)//FIX ME
	{
		
		return new ArrayList<String>();
	}
	/**
	 * 
	 * @param csg
	 * @param parent
	 * @return 
	 * return true if the upper bounder is not exceeded
	 */
	public boolean optimize(CSG csg,int parent)
	{
		List<pairCSG> sub_csglist=new ArrayList<pairCSG>();
		sub_csglist= csg.subCSG();
		if(!isInTable(csg))//csg not exist in the table regist itself
		{
			regist(new Entry(csg.tables.toString()));
		}
		/*else // if exist ,check if the csg's upper bound is larger than the parent's
		{
			int ID=Itable.find(csg.tables.toString());
			Entry entry=Itable.Get_Entry(ID);
			if(entry.upper_bound>Itable.Get_Entry(parent).upper_bound)
				return false;
			else
				return true;
		}*/
		//if the csg is empty means it has reached the bottom, and csg is a single node 
		if (sub_csglist.isEmpty())//It is a leaf node
		{
				int ID=Itable.find(csg.tables.toString());
				Entry entry=Itable.Get_Entry(ID);
				//transfer the signle table into join order
				String temp=csg.tables.toString();
				temp=temp.substring(1, temp.length()-1);//remove square
				//how to decide the cost for a single table
				//entry.JoinOrder.put(temp,(float) 0.0);
				entry.BestOrder=temp;
				entry.Esti=(float) 0.0;//Get the cardinality of the table
				entry.upper_bound=entry.Esti;//Get upper bound from parent
				return true;
		}
		String BestOrder="";
		float  LowestEst=Float.POSITIVE_INFINITY;
		int ID=Itable.find(csg.tables.toString());
		Entry entry=Itable.Get_Entry(ID);
		if(parent!=-1)
			entry.upper_bound=Itable.Get_Entry(parent).upper_bound;//get upperbound every time 
		for(pairCSG iter:sub_csglist)
		{			
			CSG left_csg=iter.left;
			CSG right_csg=iter.right;
			//if new csg is not in the information table, regist the new one with csg
			if(!isInTable(left_csg))
			{
				//regist(new Entry(left_csg.tables.toString()));
				boolean flag=optimize(left_csg,ID);
				if (flag==false)
					continue;
			}
			
			if(!isInTable(right_csg))
			{
				//regist(new Entry(right_csg.tables.toString()));
				boolean flag=optimize(right_csg,ID);
				if(flag==false)
					continue;
			}
			Itable.print();
			//get the join oder of the 2 child and merge it into a new one
			int left_id=Itable.find(left_csg.tables.toString());
			int right_id=Itable.find(right_csg.tables.toString());
			Entry left_entry=Itable.Get_Entry(left_id);
			Entry right_entry=Itable.Get_Entry(right_id);
			String order1='('+left_entry.BestOrder+','+right_entry.BestOrder+')';
			String order2='('+right_entry.BestOrder+','+left_entry.BestOrder+')';
			String SQL="";
			//pick the one with low cost
			float cost1=Float.POSITIVE_INFINITY;
			float cost2=Float.POSITIVE_INFINITY;
			if(logTable.join(left_entry.BestOrder, right_entry.BestOrder))
			{
				SQL=logTable.getPlan(order1);
				cost1=SQLSERVER_EVALUATE(SQL);
				
			}
			if(logTable.join(right_entry.BestOrder, left_entry.BestOrder))
			{
				SQL=logTable.getPlan(order2);
				cost2=SQLSERVER_EVALUATE(SQL);
			}
			
			
			if(cost1==Float.POSITIVE_INFINITY&&cost2==Float.POSITIVE_INFINITY)
				throw new RuntimeErrorException(null, "No join option valid!");
			else if (cost2>cost1)
			{
				if (cost1<LowestEst)
				{
					LowestEst=cost1;
					BestOrder=order1;
				}
			}
			else if (cost1>cost2)
			{
				if(cost2<LowestEst)
				{
					LowestEst=cost2;
					BestOrder=order2;
				}
			}
			if(entry.Esti>LowestEst)
			{
				entry.BestOrder=BestOrder;
				entry.Esti=LowestEst;
				if(LowestEst<entry.upper_bound)
					entry.upper_bound=LowestEst;
			}
			
		}
		//Need to update the score once a result is generated
		/*//get the highest score one from the join order map
		entry.BestOrder=BestOrder;
		entry.Esti=LowestEst;
		entry.upper_bound=LowestEst;*/
		if(parent==-1)
			return false;//The root node has no parent
		Entry parent_entry=Itable.Get_Entry(parent);
		if(entry.upper_bound<entry.Esti)//modified!
			return false;
		else
		{
			entry.upper_bound=entry.Esti;
			//parent_entry.upper_bound=entry.upper_bound;
			return true;
		}
	}

	/**
	 * Check if the subcsg is in the information table
	 * @param subcsg
	 * @return true if the subcsg is registed in the information table
	 */
	public boolean isInTable(CSG subcsg)
	{
		if (Itable.find(subcsg.tables.toString())!=-1)
			return true;
		else
			return false;
		
	}
	public static void main(String [] args)
	{
		TopDownOpt opt=new TopDownOpt();
		//Need to Transfer the logical table information in to csg
		CSG csg = new CSG(logTable);
		opt.optimize(csg, -1);
		opt.Itable.print();
	}
	

}
