package com.emp.entity;

public class Records {

	private Long cId;
	private String email;
	private String companyName;
	private Long eId;
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	public Records(Long cId, String email, String companyName, Long eId) {
		super();
		this.cId = cId;
		this.email = email;
		this.companyName = companyName;
		this.eId = eId;
	}
	public Records() {
		super();
	}
	
	
	
	
}
