package com.collections.set;

import java.util.Arrays;

public class Business {
	private String businessRegisteredName;
	private String legalEntityNumber;
	private String[] directors;
	private String sector;
	public String getBusinessRegisteredName() {
		return businessRegisteredName;
	}
	public void setBusinessRegisteredName(String businessRegisteredName) {
		this.businessRegisteredName = businessRegisteredName;
	}
	public String getLegalEntityNumber() {
		return legalEntityNumber;
	}
	public void setLegalEntityNumber(String legalEntityNumber) {
		this.legalEntityNumber = legalEntityNumber;
	}
	public String[] getDirectors() {
		return directors;
	}
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	@Override
	public String toString() {
		return "Business [businessRegisteredName=" + businessRegisteredName + ", legalEntityNumber=" + legalEntityNumber
				+ ", directors=" + Arrays.toString(directors) + ", sector=" + sector + "]";
	}
	
}
