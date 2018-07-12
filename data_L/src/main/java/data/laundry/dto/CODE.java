package data.laundry.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CODE {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column
	private String CODE_COMMON;
	@Column
	private int CODE_DETAIL;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCODE_COMMON() {
		return CODE_COMMON;
	}
	public void setCODE_COMMON(String cODE_COMMON) {
		CODE_COMMON = cODE_COMMON;
	}
	public int getCODE_DETAIL() {
		return CODE_DETAIL;
	}
	public void setCODE_DETAIL(int cODE_DETAIL) {
		CODE_DETAIL = cODE_DETAIL;
	}
	
	
}
