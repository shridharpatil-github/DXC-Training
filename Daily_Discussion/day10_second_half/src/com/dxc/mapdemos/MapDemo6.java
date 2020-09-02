package com.dxc.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo6 {


	public static void main(String[] args) {
		Map<String,String> empDetails=new TreeMap<>();
		empDetails.put("E0001", "John");
		empDetails.put("E0002", "Radha");
		empDetails.put("E0003", "John");
		empDetails.put("E0004", "John");
		// boolean containsKey(Object key)
		boolean isKeyPresent=empDetails.containsKey("E0001");
		System.out.println(isKeyPresent);  // It will return true as E0001 is present
		isKeyPresent=empDetails.containsKey("E0011");
		System.out.println(isKeyPresent); // It will return false
		// boolean containsValue(Object value)
		boolean isValuePresent=empDetails.containsValue("Radha");
		System.out.println(isValuePresent);
		isValuePresent=empDetails.containsValue("Johnny");
		System.out.println(isValuePresent);

	}

}
