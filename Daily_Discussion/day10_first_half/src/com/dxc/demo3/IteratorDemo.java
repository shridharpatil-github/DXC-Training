package com.dxc.demo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String reply="";
        String name="";
        do
        {
        	System.out.println("Enter a name");
        	name=scanner.nextLine();
        	names.add(name);
        	System.out.println("Do you want to continue?");
        	reply=scanner.nextLine();
        }while(reply.equalsIgnoreCase("yes"));
	
  System.out.println("The content");
  // Collection is having iterator method which returns
  // instance of Iterator
  Iterator<String> itr=names.iterator();
  // boolean hasNext(); ---> keeps on returning true till we
  // have data to read
  while(itr.hasNext())
  {
	    String nm=itr.next(); // next method 
	    //will return the next object in the iterator
	    System.out.println(nm);
  }

	
	}
}
