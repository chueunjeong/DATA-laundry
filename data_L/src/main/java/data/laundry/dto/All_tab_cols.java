package data.laundry.dto;
//http://blog.naver.com/PostView.nhn?blogId=scw0531&logNo=221105180348&parentCategoryNo=&categoryNo=28&viewDate=&isShowPopularPosts=false&from=postView

public class All_tab_cols {

	private int column_id;
	private String column_name;
	private String data_type;

	
	public int getColumn_id() {
		return column_id;
	}

	public void setColumn_id(int column_id) {
		this.column_id = column_id;
	}

	public String getColumn_name() {
		return column_name;
	}

	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

}
