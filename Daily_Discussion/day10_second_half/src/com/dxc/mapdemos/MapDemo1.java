package com.dxc.mapdemos;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo1 {

	// key and value
	// sorted on key
	// keys should be unique
	// if repeated it stores the last value
	// value can be repeated
	public static void main(String[] args) {
		TreeMap<String,String> empDetails=new TreeMap<>();
		empDetails.put("Manager", "John");
		empDetails.put("Manager", "Radha");
		empDetails.put("AsstManager", "John");
		empDetails.put("Clerk", "John");
		System.out.println(empDetails);

	}

}
