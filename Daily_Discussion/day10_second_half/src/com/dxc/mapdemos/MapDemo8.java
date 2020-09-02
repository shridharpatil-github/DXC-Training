package com.dxc.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo8 {


	public static void main(String[] args) {
		Map<String,String> empDetails=new TreeMap<>();
		empDetails.put("E0001", "John");
		empDetails.put("E0002", "Radha");
		empDetails.put("E0003", "John");
		empDetails.put("E0004", "John");
		// int size()
		System.out.println(empDetails.size()); // number of elements
	    System.out.println(empDetails.isEmpty()); //false
		// V(generic type) remove(Object key)
		System.out.println("Before removing the details of key E0001");
		System.out.println(empDetails);
		empDetails.remove("E0001");
		System.out.println("After removing the detaiks of key E0001");
		System.out.println(empDetails);

	}

}
