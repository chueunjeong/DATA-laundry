/**
 * CREATOR		: iris3
 * CREATE DATE	: 2018. 9. 21. 오후 7:48:51
 * 
 * HANIUM PROJECT. All Right Reserved. 2018. DATA WashMachine
 */
package data.laundry.dto;

/**
 * @author iris3
 *
 */
public class AnalysisInfo {
	private String tableName;
	private String columnName;
	private int attrType;
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public int getAttrType() {
		return attrType;
	}
	public void setAttrType(int attrType) {
		this.attrType = attrType;
	}
	
}
