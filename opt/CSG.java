package opt;
import java.util.*;
import logicalPlanTable.*;

public class CSG {
	
	List<String> edges  ;
	List<String> tables ;
	
	public CSG() {
		edges = new ArrayList<String> ();
		tables = new ArrayList<String>();
	}
	
	
	public CSG(LogicalPlanTable t) {
		edges = new ArrayList<String> ();
		tables = new ArrayList<String>();
		for(LogicalPlanTableRow r: t.getLogicalPlanTableRow()){
			String joinOrder = r.getJoinOrder();
			if(joinOrder.trim().length() == 1) {
				this.addTable(joinOrder);
			}else if(joinOrder.trim().length() == 5) {
				this.addEdge(joinOrder);
			}else {
				System.out.println("ERROR: WRONG FORMAT " + joinOrder);
			}
		}
		
	}
	
	/*define pair class: <subCSG1, subCSG2>
	public class pairCSG {
		CSG left = new CSG();
		CSG right = new CSG();
		public pairCSG(CSG left, CSG right) {
			this.left = left;
			this.right = right;
		}
	}
	*/
	public void addEdge(List<String> newEdges) {
		for(String edge: newEdges) {
			if(edge.length() == 5 && !edges.contains(edge)) {
				edges.add(edge);
			}else {
				System.out.println("ERROR: WRONG EDGE FORMAT: " + edge);
			}
		}
	}
	
	public void addEdge(String edge) {
		if(edge.length() == 5 && !edges.contains(edge)) {
			edges.add(edge);
		}else {
			System.out.println("ERROR: WRONG EDGE FORMAT");
		}
	}
	
	public void add(List<String> edgeAndTable) {
		for(String s:edgeAndTable) {
			if(s.trim().length() == 1) {
				this.addTable(s);
			}else if(s.trim().length() == 5) {
				this.addEdge(s);
			}
		}
	}
	
	
	public void deleteEdge(String edge) {
		if(edges.contains(edge)) {
			edges.remove(edge);
		}else {
			System.out.println("ERROR NO SUCH EDGE :" + edge);
		}
	}
	
	public void addTable(String newTable) {
		if(newTable.length() == 1 && !tables.contains(newTable)) {
			tables.add(newTable);
		}else {
			System.out.println("ERROR WHEN ADD TABLE");

		}
	}
	
	public boolean containsTable(String table) {
		return this.tables.contains(table);
	}
	
	public boolean containsEdge(String edge) {
		return this.edges.contains(edge);
	}

	
	/**
	 * 
	 * @return 
	 */
	public List<pairCSG> subCSG() {	
		List<pairCSG> subCSGList = new ArrayList<pairCSG>();
		//keep a record to avoid repeated cuts (C,O) & (O,C)
		List<String> cutEdges = new ArrayList<String>();
		//start cutting edges
		for(String edge:this.edges) {
			if(cutEdges.contains(edge)) { //its reverse has already been cut, then skip
				continue;
			}
			CSG left = new CSG();
			CSG right = new CSG();
			//suupose edge: (t1,t2)
			//add tables to different subCSGs
			String table1 = edge.substring(1,2);
			String table2 = edge.substring(3,4);
			left.addTable(table1);
			right.addTable(table2);
			//find reverse edge: (t2, t1) and add to cut list
			String edgeReverse = "(" + table2 + "," + table1 + ")";
			cutEdges.add(edge);
			cutEdges.add(edgeReverse);
			//get a copy of edges, removing edge and its reverse
			List<String> edgeCopy = new ArrayList<String>();
			for(String tmp: edges) {
				if(!tmp.equals(edge) && !tmp.equals(edgeReverse)) {
					edgeCopy.add(tmp);
				}
			}
			
			//while some edges are not classified into sub csg 
			while(!edgeCopy.isEmpty()) {
				for(int i = 0; i < edgeCopy.size(); i++) {
					String otherEdge = edgeCopy.get(i);
					String lTable = otherEdge.substring(1,2);
					String rTable = otherEdge.substring(3,4);
					if(left.containsTable(lTable) || left.containsTable(rTable)) {
						//add edge to the left sub scg
						left.addEdge(otherEdge);
						//add table to table lists
						if(!left.containsTable(lTable)) {
							left.addTable(lTable);
						}
						if(!left.containsTable(rTable)) {
							left.addTable(rTable);
						}
						edgeCopy.remove(otherEdge);
					}else if (right.containsTable(otherEdge.substring(1,2)) ||right.containsTable(otherEdge.substring(3,4))) {
						//add edge to the left sub scg
						right.addEdge(otherEdge);
						//add table to table lists
						if(!right.containsTable(lTable)) {
							right.addTable(lTable);
						}
						if(!right.containsTable(rTable)) {
							right.addTable(rTable);
						}
						edgeCopy.remove(otherEdge);
					}
				}
			}
			
			subCSGList.add(new pairCSG(left, right));			
			
		}
		
		return subCSGList;
	}
	
	public static void main(String[] args) {
		List<String> input = Arrays.asList("C","O","N","L","K","(K,N)","(N,K)","(C,O)","(O,C)","(L,O)","(O,L)","(C,N)","(N,C)");
		CSG csg = new CSG();
		csg.add(input);
		System.out.println(csg.tables.toString() + csg.edges.toString());

		List<pairCSG> subCSG = csg.subCSG();
		System.out.println(subCSG.size());
		for(pairCSG p :subCSG) {
			System.out.println(p.left.tables.toString() + p.left.edges.toString() + "   " + p.right.tables.toString() + p.right.edges.toString());
		}
	}
	
	
}
