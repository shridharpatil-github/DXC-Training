package com.dxc.collection.arraylist;

import java.util.ArrayList;
// boolean addAll( Collection c)
public class ArrayListDemo8 {

	public static void main(String[] args) {
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("Ravi");
		names1.add("Ashok");
		names1.add("Radha");
		names1.add("Ravi");
		names1.add("Zuben");
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("DXC");
		names2.add("CTS");
		names2.add("TCS");
		names2.add("IBM");
		names2.add("Capgemini");
        System.out.println("names1");
        
		System.out.println(names1);
		
		System.out.println("names2");
		
		System.out.println(names2);
		
		// In names1 ArrayList add names2 ArrayList
		
		names1.addAll(3,names2);
		
		System.out.println(names1);
		
	}

}
