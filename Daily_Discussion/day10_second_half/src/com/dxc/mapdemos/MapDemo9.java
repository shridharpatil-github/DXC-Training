package com.dxc.mapdemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class MapDemo9 {


	public static void main(String[] args) {
		Map<String,String> empDetails=new TreeMap<>();
		empDetails.put("E0001", "John");
		empDetails.put("E0002", "Radha");
		empDetails.put("E0003", "John");
		empDetails.put("E0004", "John");
		
		// Set<K> keySet();
		// Why keySet is returning set
		// keys here are always unique
	Set<String> keys=empDetails.keySet();
    System.out.println(keys);	
    
       // Collection<K> values();
    Collection<String> values=empDetails.values();
    System.out.println(values);
		
	}

}
