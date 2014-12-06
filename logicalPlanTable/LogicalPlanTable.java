package logicalPlanTable;

import java.util.ArrayList;
import java.util.LinkedList;

public class LogicalPlanTable {
	//rowList is the list of logical plan table rows.
	private ArrayList<LogicalPlanTableRow> rowList;
	
	public LogicalPlanTable(){
		this.rowList = new ArrayList<LogicalPlanTableRow>();
	}

	/**
	 * addTableRow is used to add a table row
	 * @param tableName is the table's name
	 */
	public LogicalPlanTableRow addTableRow(String tableName){
		tableName = tableName.toUpperCase();
		if(tableName.equals("PARTSUPP")){
			LogicalPlanTableRow row = new LogicalPlanTableRow("PS");
			row.setTableName(tableName);
			rowList.add(row);
			return row;
		}
		else{
			LogicalPlanTableRow row = new LogicalPlanTableRow(tableName.substring(0,1));
			row.setTableName(tableName);
			rowList.add(row);
			return row;
		}
	}
	/**
	 * addEdgeRow is used to add an edge row
	 * @param leftChild is its left child
	 * @param rightChild is its right child
	 * @param jpred is its join predicate
	 */
/*	public void addEdgeRow(String leftChild, String rightChild, String jpred){
		LogicalPlanTableRow leftChildRow = getRow(leftChild);
		LogicalPlanTableRow rightChildRow = getRow(rightChild);
		String joinOrder = "(" + leftChild + "," + rightChild + ")";
		LogicalPlanTableRow edgeRow = new LogicalPlanTableRow(joinOrder, 
															leftChildRow, 
															rightChildRow, 
															jpred);
		edgeRow.setIndex(rowList.size());
		rowList.add(edgeRow);
	}
*/
	/**
	 * initColumnList is used to init the columns for the join graph
	 * @param columnList the input column list 
	 */
	public void initColumnList(LinkedList<String[]> columnList){
		if(columnList.size() > 0){
			for(String[] column : columnList){
				LogicalPlanTableRow row = getRow(column[0]);
				row.addColumn(column[1]);
			}
		}
	}
	public ArrayList<LogicalPlanTableRow> getLogicalPlanTableRow()
	{
		return this.rowList;
	}
	/**
	 * initSpredList is used to init spred for the join graph
	 * @param spredList is the input spred list
	 */
	public void initSpredList(LinkedList<String[]> spredList) {
		for(String[] spred : spredList){
			LogicalPlanTableRow row = getRow(spred[0]);
			row.addSpred(spred[1]);
		}
	}
	public void initEdgeList(LinkedList<String[]> jpredList){
		for(String[] jpred : jpredList){
			LogicalPlanTableRow leftChild = getRow(jpred[0]);
			LogicalPlanTableRow rightChild = getRow(jpred[1]);
			String joinOrder = "(" + leftChild.getJoinOrder() + "," + rightChild.getJoinOrder() + ")";
			String jpredString = jpred[2] + "=" + jpred[3];
			LogicalPlanTableRow edgeRow1 = new LogicalPlanTableRow(joinOrder, leftChild, rightChild, jpredString); 
			edgeRow1.toPlan();
			
			joinOrder = "(" + rightChild.getJoinOrder() + "," + leftChild.getJoinOrder() + ")";
			jpredString = jpred[3] + "=" + jpred[2];
			LogicalPlanTableRow edgeRow2 = new LogicalPlanTableRow(joinOrder, rightChild, leftChild, jpredString); 
			edgeRow2.toPlan();
			
			rowList.add(edgeRow1);
			rowList.add(edgeRow2);
		}
	}
	
	/**
	 * getRow is used to get the row with given name
	 * @param name is the given name
	 * @return the row with given name if found, null if not found
	 */
	public LogicalPlanTableRow getRow(String joinOrder){
		joinOrder = joinOrder.replaceAll(" ", "");
		for(LogicalPlanTableRow row : rowList){
			String currentJoinOrder = row.getJoinOrder();
			if(currentJoinOrder.equalsIgnoreCase(joinOrder)){
				return row;
			}
		}
		return null;
	}
	/**
	 * getRow is used to get the row with given index
	 * @param index is the given index
	 * @return the row with given index, null if no such row
	 */
	public LogicalPlanTableRow getRow(int index){
		if(rowList.size() > index){
			return rowList.get(index);
		}
		else{
			return null;
		}
	}
	/**
	 * used to generate logical plan for each row
	 */
	public void generatePlans(){
		for(LogicalPlanTableRow row : rowList){
			row.toPlan();
		}
	}
	
	/**
	 * getPlan is used to get a plan by input join order
	 * @param 
Order is the input join order
	 * @return its plan
	 */
	public String getPlan(String joinOrder){
		LogicalPlanTableRow row = getRow(joinOrder);
		if(row == null){
			return "";
		}
		return row.getPlan();
	}
	/**
	 * join is used to join two plans
	 * @param leftJoinOrder the left join plan's join order
	 * @param rightJoinOrder the right join plan's join order
	 * @return true if succeed, false otherwise
	 */
	public Boolean join(String leftJoinOrder, String rightJoinOrder){
		LogicalPlanTableRow leftChild = getRow(leftJoinOrder);
		LogicalPlanTableRow rightChild = getRow(rightJoinOrder);
		for(LogicalPlanTableRow row : rowList){
			if(row.checkEdge(leftChild, rightChild)){
				String joinOrder = "(" + leftJoinOrder + "," + rightJoinOrder + ")";
				LogicalPlanTableRow newRow = new LogicalPlanTableRow(joinOrder, leftChild, rightChild, row.getJpred());
				newRow.toPlan();
				rowList.add(newRow);
				return true;
			}
		}
		return false;
	}

	public void print(){
		System.out.println("tableName  joinOrder lChild rChild  jpred  spred columnName content");
		for(LogicalPlanTableRow row : rowList){
			System.out.print(row.getTableName() + "\t" + row.getJoinOrder() + "\t" +
		row.getJpred() + "\t" + row.getSpredList() + "\t" + 
								row.getColumnList() + "\t" );
			System.out.println();
		}
	
	}

}
