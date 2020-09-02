package com.dxc.collection.arraylist;

import java.util.ArrayList;

// void add(int index, E obj)
public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		// Generics helps in mentioning the 
		//names.add(1);
		names.add("Ravi");
		names.add("Ashok");
		// indexing starts with 0 as array indexing
		names.add(1,"Suresh");
		for(String name : names)
		{
			System.out.println(name);
		}
	}

}
