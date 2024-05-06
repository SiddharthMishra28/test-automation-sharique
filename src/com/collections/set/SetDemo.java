package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<String> myStrings = new HashSet<>();
		myStrings.add("github");
		myStrings.add("Gitlab");
		myStrings.add("Github");
		myStrings.add("jenkins");
		myStrings.add("gitlab");
		System.out.println(myStrings);
		
		Set<Business> businesses = new HashSet<>();
		
		Business cocaCola = new Business();
		cocaCola.setBusinessRegisteredName("Coca cola co.");
		cocaCola.setDirectors(new String[] {"salil mathew"});
		cocaCola.setLegalEntityNumber("IND3802382");
		cocaCola.setSector("Food and Beverages");
		
		Business cocaCola2 = new Business();
		cocaCola.setBusinessRegisteredName("Pepsico");
		cocaCola.setDirectors(new String[] {"salil mathew"});
		cocaCola.setLegalEntityNumber("IND3802383");
		cocaCola.setSector("Food and Beverages");
		
		businesses.add(cocaCola);
		businesses.add(cocaCola2);
		
		System.out.println(businesses);
	}
}
