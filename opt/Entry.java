package opt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entry 
{
	Map<String,Float> JoinOrder;
	String csg;
	List sub_csg;
	float upper_bound;
	float Esti;
	String BestOrder;
	//int parent;
	int ID;
	public Entry()
	{
		csg="";		
		Esti=Float.POSITIVE_INFINITY;
		upper_bound=Float.POSITIVE_INFINITY;
		//sub_csg=new ArrayList<String>();
		//JoinOrder=new HashMap<String,Float>();
		BestOrder="";
		//parent=-1;
		ID=-1;
	}
	public Entry(String input_csg)
	{
		csg=input_csg;		
		Esti=Float.POSITIVE_INFINITY;
		upper_bound=Float.POSITIVE_INFINITY;
		BestOrder="";
		//sub_csg=new ArrayList<String>();
		//JoinOrder=new HashMap<String,Float>();
		//parent=-1;
		ID=-1;
	} 
	public void print()
	{
		System.out.println("ID:"+String.format("%s", this.ID)+"\t csg:"+String.format("%-20s",this.csg)+"Upper bound:"+this.upper_bound +"\t\t Esti:"+this.Esti+"\t\t BestOrder:"+this.BestOrder);
		
	}
}