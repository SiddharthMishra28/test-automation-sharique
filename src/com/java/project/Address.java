package com.java.project;

public class Address {
	private int id;
	private String locality;
	private String area;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		
	}

	public Address(int id, String locality, String area, String city, String state, String country) {
		super();
		this.id = id;
		this.locality = locality;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", locality=" + locality + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	
}
