package com.emp.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private long eId;
	private String name;
	private String phone;
	
	List<Records> records = new ArrayList<>();

	public long geteId() {
		return eId;
	}

	public void seteId(long eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Records> getRecords() {
		return records;
	}

	public void setRecords(List<Records> records) {
		this.records = records;
	}

	public Employee(long eId, String name, String phone, List<Records> records) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
		this.records = records;
	}

	public Employee(long eId, String name, String phone) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
	}

	public Employee() {
		super();
	}
	
	
	

}
