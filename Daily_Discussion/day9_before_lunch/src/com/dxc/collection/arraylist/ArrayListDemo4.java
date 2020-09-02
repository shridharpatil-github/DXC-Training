package com.dxc.collection.arraylist;

import java.util.ArrayList;

// E get(int index) // get me the item at the mentioned index
// int size()----> Which returns the number of elements in an ArrayList
// boolean isEmpty()----> Which returns true if the ArrayList is empty
public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		System.out.println("Before inserting----->");
		System.out.println(names.size());		
		System.out.println("Is the ArrayList empty");
		System.out.println(names.isEmpty()); // true
		names.add("Ravi");
		names.add("Ashok");
		names.add("Radha");
		names.add("Ravi");
		names.add("Zuben");
		System.out.println("After inserting------>");
		System.out.println(names.size());
		System.out.println("Is the ArrayList empty after adding items");
		System.out.println(names.isEmpty()); //false
		System.out.println(names);
		// Basesd on position we can search an item
		System.out.println(names.get(3));
		//System.out.println(names.get(20));// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 20, Size: 5
	
	
	}

}
