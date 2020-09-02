package com.dxc.demo5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//Its stores in the order of insertion
		Set<String> names=new LinkedHashSet<>();
	    
		names.add("ram");
		names.add("rahul");
		names.add("rahul");
		names.add("ajay");
		names.add("gita");
		System.out.println(names);
				
		System.out.println("To display ");
		for(String name : names)
		{
			System.out.println(name);
		}
		System.out.println("Iterator to display");
        Iterator<String> iterator=names.iterator();	
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next());
        }
		// In set we will never get method called 
        // E get(int index)
        

	}

}
