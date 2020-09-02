package com.dxc.mapdemos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo7 {


	public static void main(String[] args) {
		Map<String,String> empDetails=new TreeMap<>();
		empDetails.put("E0001", "John");
		empDetails.put("E0002", "Radha");
		empDetails.put("E0003", "John");
		empDetails.put("E0004", "John");
		// V get(Object key); -----> return the value
		String value=empDetails.get("E0001");  // John
		System.out.println(value);
		value=empDetails.get("E0011"); 
		System.out.println(value); // null
		if(value==null)
		{
			System.out.println("Key not found!!!!");
		}

	}

}
