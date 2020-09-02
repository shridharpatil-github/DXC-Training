package com.dxc.collection.arraylist;

import java.util.ArrayList;

// int indexOf(Object object) --> returns the index of first instance
// int lastIndexOf(Object object) ---> returns the index of last instance
public class ArrayList5 {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Amit");
		names.add("Sunita");
		names.add("Radha");
		names.add("Rohan");
		names.add("Amit");
		System.out.println(names.indexOf("Amit"));  //0
		System.out.println(names.lastIndexOf("Amit")); // 4
        System.out.println(names.indexOf("Xavier")); // -1
	}

}
