package com.dxc.collection.arraylist;

import java.util.ArrayList;

// Remove can be based on position which Returns the object removed
// E remove(int position)
// Remove can be based on the object
// boolean remove(Object obj)
public class ArrayListDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ravi");
		names.add("Ashok");
		names.add("Radha");
		names.add("Ravi");
		names.add("Zuben");
		// Remove based on position
		String removedObject=names.remove(1);
		System.out.println("The removed Object is "+removedObject);
		System.out.println("The list after removing item from pos 1");
		System.out.println(names);
		// Remove the object based on Object name
		boolean isRemoved=names.remove("Zuben");
		System.out.println(isRemoved);
		System.out.println(names);
		isRemoved=names.remove("Akash");
		System.out.println(isRemoved);
	}

}
