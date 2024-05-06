package com.collections.compound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompoundCollectionDemo {
	public static void main(String[] args) {
//		List<String> userData = new ArrayList<>();
//		userData.add("sid");
//		userData.add("mishra");
//		System.out.println(userData);
//		
//		Map<String, String> userDataMap = new HashMap<>();
//		userDataMap.put("firstName", "sid");
//		userDataMap.put("lastName", "mishra");
//		userDataMap.put("email", "sid@test.com");
		
//		List<Map<String, String>> userData = new ArrayList<Map<String,String>>();
//		Map<String, String> userRow = new HashMap<String, String>();
//		userRow.put("firstName", "sid");
//		userRow.put("lastName", "mishra");
//		userRow.put("email", "sid@test.com");
//		userData.add(userRow);
//		System.out.println(userData.get(2).get("firstName"));
		
		Map<Integer, User> userData = new HashMap<>();
		User firstRow = new User();
		firstRow.setFirstName("sid");
		firstRow.setLastName("mishra");
		firstRow.setEmail("sid@test.com");
		userData.put(1, firstRow);
	}
}
