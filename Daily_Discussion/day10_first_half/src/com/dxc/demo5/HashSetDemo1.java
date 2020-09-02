package com.dxc.demo5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		//HashSet<String> names=new HashSet<>();
		Set<String> names=new HashSet<>();
	    boolean b;
		b=names.add("ram");
		System.out.println(b);
		b=names.add("rahul");
		System.out.println(b);
		b=names.add("rahul");
		System.out.println(b);
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
