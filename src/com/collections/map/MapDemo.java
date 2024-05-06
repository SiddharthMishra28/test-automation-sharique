package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> states = new HashMap<>();
		states.put("MH", "MAHARASHTRA");
		states.put("OD", "ODISHA");
		states.put("JK", "JAMMU & KASHMIR");
		states.put("MH", "Madhya pradesh");
		states.put(null, "NOTHING");
		System.out.println(states);
	}
}
