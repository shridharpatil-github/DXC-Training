package com.dxc.collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		// Generics helps in mentioning the 
		//names.add(1);
		names.add("Ravi");
		names.add("Ashok");
		for(String name : names)
		{
			System.out.println(name);
		}
	}

}
