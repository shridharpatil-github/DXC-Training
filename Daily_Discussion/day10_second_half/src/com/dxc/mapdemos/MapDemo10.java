package com.dxc.mapdemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class MapDemo10 {


	public static void main(String[] args) {
		Map<String,String> empDetails=new TreeMap<>();
		empDetails.put("E0001", "John");
		empDetails.put("E0002", "Radha");
		empDetails.put("E0003", "John");
		empDetails.put("E0004", "John");
		
		// Iterate through all key value pairs
		
		Set<String> keys=empDetails.keySet();
		for(String key : keys)
		{
			System.out.println("Key "+key+" "+"Value"+empDetails.get(key));
		}
		
		
	}

}
