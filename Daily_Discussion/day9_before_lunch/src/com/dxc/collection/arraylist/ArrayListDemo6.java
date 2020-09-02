package com.dxc.collection.arraylist;

// void clear(); // It will delete all the
// items from the list
import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ravi");
		names.add("Ashok");
		names.add("Radha");
		names.add("Ravi");
		names.add("Zuben");
		System.out.println("Before clearing");
		System.out.println(names);
		names.clear();
		System.out.println("After clearing");
		System.out.println(names);
	}

}
