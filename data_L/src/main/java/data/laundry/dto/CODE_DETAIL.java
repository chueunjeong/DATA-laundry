package data.laundry.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class CODE_DETAIL {


	@Id
	@Column(name="ID")
	private int id;
	@Column
	private int DETAIL_CODE;
	@Column
	private String CODE_COMMON_ID;
	@Column
	private String DETAIL_DESCRIPTION;
	@Column
	private String DETAIL_ORDER;
	@Column
	private String	DETAIL_USAGE;
	@Column
	private String DETAIL_NAME;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDETAIL_CODE() {
		return DETAIL_CODE;
	}
	public void setDETAIL_CODE(int dETAIL_CODE) {
		DETAIL_CODE = dETAIL_CODE;
	}
	public String getCODE_COMMON_ID() {
		return CODE_COMMON_ID;
	}
	public void setCODE_COMMON_ID(String cODE_COMMON_ID) {
		CODE_COMMON_ID = cODE_COMMON_ID;
	}
	public String getDETAIL_DESCRIPTION() {
		return DETAIL_DESCRIPTION;
	}
	public void setDETAIL_DESCRIPTION(String dETAIL_DESCRIPTION) {
		DETAIL_DESCRIPTION = dETAIL_DESCRIPTION;
	}
	public String getDETAIL_ORDER() {
		return DETAIL_ORDER;
	}
	public void setDETAIL_ORDER(String dETAIL_ORDER) {
		DETAIL_ORDER = dETAIL_ORDER;
	}
	public String getDETAIL_USAGE() {
		return DETAIL_USAGE;
	}
	public void setDETAIL_USAGE(String dETAIL_USAGE) {
		DETAIL_USAGE = dETAIL_USAGE;
	}
	public String getDETAIL_NAME() {
		return DETAIL_NAME;
	}
	public void setDETAIL_NAME(String dETAIL_NAME) {
		DETAIL_NAME = dETAIL_NAME;
	}
		
}
