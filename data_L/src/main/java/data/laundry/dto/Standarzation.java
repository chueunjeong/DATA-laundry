package data.laundry.dto;

public class Standarzation {
	private int id;
	private int meta_column_id;
	private int group_code_id;
	private int detail_code_id;
	
	private String table_name;
	private String column_name;
	private String group_code_name;
	private String detail_code_name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMeta_column_id() {
		return meta_column_id;
	}
	public void setMeta_column_id(int meta_column_id) {
		this.meta_column_id = meta_column_id;
	}
	public int getGroup_code_id() {
		return group_code_id;
	}
	public void setGroup_code_id(int group_code_id) {
		this.group_code_id = group_code_id;
	}
	public int getDetail_code_id() {
		return detail_code_id;
	}
	public void setDetail_code_id(int detail_code_id) {
		this.detail_code_id = detail_code_id;
	}
	
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getColumn_name() {
		return column_name;
	}
	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}
	public String getGroup_code_name() {
		return group_code_name;
	}
	public void setGroup_code_name(String group_code_name) {
		this.group_code_name = group_code_name;
	}
	public String getDetail_code_name() {
		return detail_code_name;
	}
	public void setDetail_code_name(String detail_code_name) {
		this.detail_code_name = detail_code_name;
	}
	
	
	
}
