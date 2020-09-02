package com.dxc.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo5 {

	// key and value
	// sorted on key
	// keys should be unique
	// if repeated it stores the last value
	// value can be repeated'
	// TreeMap, HashMap, LinkedHashMap all implements
	// Map interface
	// It is best practice to create a reference
	// of Map type rather than TreeMap,HashMap or 
	// LinkedHashMap
	public static void main(String[] args) {
		Map<String,String> empDetails=new TreeMap<>();
		empDetails.put("Manager", "John");
		empDetails.put("Manager", "Radha");
		empDetails.put("AsstManager", "John");
		empDetails.put("Clerk", "John");
		System.out.println(empDetails);

	}

}
