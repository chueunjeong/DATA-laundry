package data.laundry.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CODE_COMMON {

	@Id
	@Column(name="ID")
	private int id;
	
	@Column
	private String GROUP_CODE;
	@Column
	private String GROUP_NAME;
	@Column
	private String GROUP_DESCRIPTION;
	@Column
	private String DATE_CREATED;
	@Column
	private String DATE_EDITED;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGROUP_CODE() {
		return GROUP_CODE;
	}
	public void setGROUP_CODE(String gROUP_CODE) {
		GROUP_CODE = gROUP_CODE;
	}
	public String getGROUP_NAME() {
		return GROUP_NAME;
	}
	public void setGROUP_NAME(String gROUP_NAME) {
		GROUP_NAME = gROUP_NAME;
	}
	public String getGROUP_DESCRIPTION() {
		return GROUP_DESCRIPTION;
	}
	public void setGROUP_DESCRIPTION(String gROUP_DESCRIPTION) {
		GROUP_DESCRIPTION = gROUP_DESCRIPTION;
	}
	public String getDATE_CREATED() {
		return DATE_CREATED;
	}
	public void setDATE_CREATED(String dATE_CREATED) {
		DATE_CREATED = dATE_CREATED;
	}
	public String getDATE_EDITED() {
		return DATE_EDITED;
	}
	public void setDATE_EDITED(String dATE_EDITED) {
		DATE_EDITED = dATE_EDITED;
	}
		
	
}
