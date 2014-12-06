package logicalPlanTable;

import java.util.LinkedList;

/**
 * LPlTableRow is logical plan table row.
 * @author Zhibo Peng (docp@brandeis.edu)
 *
 */
public class LogicalPlanTableRow {
	//joinOrder is current logical plan's join order
	private String joinOrder;
	//tableName is current table's name
	private String tableName;
	//leftChild is current subgraph's left child
	private LogicalPlanTableRow leftChild;
	//rightChild is current subgraph's right child
	private LogicalPlanTableRow rightChild;
	//jpred is current subgraph's join predicate
	private String jpred;
	//spredList is its select predicate 
	private LinkedList<String> spredList;
	//columnList is its projected columns
	private LinkedList<String> columnList;
	//joinPlan is the join plan for current plan
	private String joinPlan;
	//content is current graph table row's content
	private String plan;
	
	public LogicalPlanTableRow(){
		setSpredList(new LinkedList<String>());
		setColumnList(new LinkedList<String>());
	}
	
	public LogicalPlanTableRow(String joinOrder){
		setSpredList(new LinkedList<String>());
		setColumnList(new LinkedList<String>());
		setJoinOrder(joinOrder);
	}

	public LogicalPlanTableRow(String joinOrder, LogicalPlanTableRow leftChild, LogicalPlanTableRow rightChild, String jpred){
		setLeftChild(leftChild);
		setRightChild(rightChild);
		setSpredList(new LinkedList<String>());
		setColumnList(new LinkedList<String>());
		this.addColumnList(leftChild.getColumnList());
		this.addColumnList(rightChild.getColumnList());
		this.addSpredList(leftChild.getSpredList());
		this.addSpredList(rightChild.getSpredList());
		setJoinOrder(joinOrder);
		setJpred(jpred);
	}
	
	/**
	 * @return the joinOrder
	 */
	public String getJoinOrder() {
		return joinOrder;
	}

	/**
	 * @param joinOrder the joinOrder to set
	 */
	public void setJoinOrder(String joinOrder) {
		joinOrder = joinOrder.replaceAll(" ", "");
		this.joinOrder = joinOrder;
	}

	/**
	 * @return the tableName
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}



	/**
	 * @return the leftChild
	 */
	public LogicalPlanTableRow getLeftChild() {
		return leftChild;
	}

	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(LogicalPlanTableRow leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * @return the rightChild
	 */
	public LogicalPlanTableRow getRightChild() {
		return rightChild;
	}

	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(LogicalPlanTableRow rightChild) {
		this.rightChild = rightChild;
	}

	/**
	 * @return the jpred
	 */
	public String getJpred() {
		return jpred;
	}

	/**
	 * @param jpred the jpred to set
	 */
	public void setJpred(String jpred) {
		this.jpred = jpred;
	}

	/**
	 * @return the spredList
	 */
	public LinkedList<String> getSpredList() {
		return spredList;
	}

	/**
	 * @param spredList the spredList to set
	 */
	public void setSpredList(LinkedList<String> spredList) {
		this.spredList = spredList;
	}
	/**
	 * add a spred to current row
	 * @param spred the spred to add
	 */
	public void addSpred(String spred) {
		spredList.add(spred);
	}
	
	
	public void addSpredList(LinkedList<String> spredList) {
		this.spredList.addAll(spredList);
	}
	
	/**
	 * @return the columnList
	 */
	public LinkedList<String> getColumnList() {
		return columnList;
	}

	/**
	 * @param columnList the columnList to set
	 */
	public void setColumnList(LinkedList<String> columnList) {
		this.columnList = columnList;
	}

	/**
	 * used to add a column to current row
	 * @param column the input column
	 */
	public void addColumn(String column){
		columnList.add(column);
	}
	/**
	 * @param used to add a list of columns to current row
	 */
	public void addColumnList(LinkedList<String> columnList) {
		this.columnList.addAll(columnList);
	}
	/**
	 * @return the joinPlan
	 */
	public String getJoinPlan() {
		return joinPlan;
	}

	/**
	 * @param joinPlan the joinPlan to set
	 */
	public void setJoinPlan(String joinPlan) {
		this.joinPlan = joinPlan;
	}
	/**
	 * generateJoinPlan is used to generate current join plan.
	 * @param leftChild its 
	 * @param rightChild
	 */
	private void generateJoinPlan() {
		joinPlan = "(";
		joinPlan += leftChild.getJoinPlan();
		joinPlan += " JOIN ";
		joinPlan += rightChild.getJoinPlan();
		joinPlan += " ON ";
		joinPlan += jpred;
		joinPlan += ")";
	}
	/**
	 * @return the plan
	 */
	public String getPlan() {
		return plan;
	}

	/**
	 * @param plan the plan to set
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}

	public void toPlan(){
		plan = "";
		if(leftChild == null && rightChild == null){
			setJoinPlan(tableName);
			plan += "SELECT";
			if(columnList.size() > 0){
				for(int i = 0; i < columnList.size(); i++){
					if(i > 0){
						plan += ",";
					}
					plan += " ";
					plan += columnList.get(i);
				}
			}
			else{
				plan += " *";
			}
			plan += " FROM " + joinPlan;
			if(spredList.size() > 0){
				plan += " WHERE";
				for(int i = 0;i < spredList.size(); i++){
					if(i > 0){
						plan += ",";
					}
					plan += " ";
					plan += spredList.get(i);
				}
			}
		}
		else{
			generateJoinPlan();
			plan += "SELECT";
			if(columnList.size() > 0){
				for(int i = 0; i < columnList.size(); i++){
					if(i > 0){
						plan += ",";
					}
					plan += " ";
					plan += columnList.get(i);
				}
			}
			else{
				plan += " *";
			}
			
			plan += " FROM " + joinPlan;
			
			if(spredList.size() > 0){
				plan += " WHERE";
				for(int i = 0;i < spredList.size(); i++){
					if(i > 0){
						plan += "AND";
					}
					plan += " ";
					plan += spredList.get(i);
				}
			}
		}
	}
	
	/**
	 * IsChildOf is used to indicate whether current plan is a child of the input plan
	 * @param row is the input plan 
	 * @return true if its a child, false otherwise
	 */
	public Boolean isChildOf(LogicalPlanTableRow row){
		if(row == null){
			return false;
		}
		if(row == this){
			return true;
		}
		else{
			return isChildOf(row.leftChild) || isChildOf(row.rightChild);
		}
	}
	/**
	 * checkEdge is used to check whether current edge can be used to join two plans
	 * @param leftRow is the left plan to join
	 * @param rightRow is the right plan to join
	 * @return true if succeed, false otherwise
	 */
	public Boolean checkEdge(LogicalPlanTableRow leftRow, LogicalPlanTableRow rightRow){
		if(leftChild == null || rightChild == null){
			return false;
		}
		else{
			if(leftChild.isChildOf(leftRow) && rightChild.isChildOf(rightRow)){
				return true;
			}
			return false;
		}
	}
}
