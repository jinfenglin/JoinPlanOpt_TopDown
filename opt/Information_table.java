package opt;

import java.util.ArrayList;
import java.util.List;

public class Information_table{
	List<Entry> table;
	int cardinality;
	public Information_table()
	{
		table=new ArrayList<Entry>();
		cardinality=0;
	}
	/**
	 * Add one new entry into the list
	 * return the entry's ID
	 */
	public int add_entry(Entry entry)
	{
		table.add(entry);
		cardinality+=1;
		entry.ID=cardinality-1;
		return entry.ID;
	}
	/**
	 * Return the entry at location n of table
	 * @param n
	 * Location of the entry in the list to get.
	 * @return
	 */
	/**
	 * input the csg to find the location of the entry in the array
	 * @param csg
	 * @return if find return location else return -1
	 */
	public boolean same(String csg1,String csg2)
	{
		if (csg1.length()!=csg2.length())
			return false;
		for(int i=0;i<csg2.length()-1;i++)
		{
			if(!csg1.contains(csg2.substring(i,i+1)))
				return false;
		}
		return true;
	}
	public int find(String csg)
	{
		for(Entry entry:table)
		{
			if(same(entry.csg,csg))
				return entry.ID;
		}
		return -1;
	}
	public Entry Get_Entry(int n)
	{
		return table.get(n);
	}
	public void print()
	{
		System.out.println("---------------Information table---------------");
		for(Entry entry:this.table)
		{
			entry.print();
		}
		System.out.println("");
	}
	/**
	 * return the parent entry of the entry input
	 * @param entry
	 * @return
	 */
	/*public Entry Get_parent(Entry entry)
	{
		return Get_Entry(entry.parent);
	}*/
}
