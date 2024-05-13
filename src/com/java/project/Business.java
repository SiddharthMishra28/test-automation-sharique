package com.java.project;

import java.util.List;

public class Business {
	private int id;
	private String legalEntity;
	private String tin;
	private String businessSector;
	List<Customer> customers;
	
	public Business() {
		
	}
	
	public Business(int id, String legalEntity, String tin, String businessSector, List<Customer> customers) {
		super();
		this.id = id;
		this.legalEntity = legalEntity;
		this.tin = tin;
		this.businessSector = businessSector;
		this.customers = customers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getBusinessSector() {
		return businessSector;
	}

	public void setBusinessSector(String businessSector) {
		this.businessSector = businessSector;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Business [id=" + id + ", legalEntity=" + legalEntity + ", tin=" + tin + ", businessSector="
				+ businessSector + ", customers=" + customers + "]";
	}
	
	
	
}
