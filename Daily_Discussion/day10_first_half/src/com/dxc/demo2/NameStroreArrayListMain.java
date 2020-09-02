package com.dxc.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
// if a member is final static
// final means we cannot change
// // static means class variable or shared by all objects
// public class 
/* public class System {
    public static final InputStream in;
  // in is representing the standard input device which is keyboard
} */
import java.util.Scanner;

public class NameStroreArrayListMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		NameStoreArrayList store=new NameStoreArrayList();
		List<String> list=new ArrayList<String>(); 
		// change to LinkedList
		//List<String> list=new LinkedList<String>(); 
		System.out.println("Enter the names separated by ;");
		String str=scanner.next();
		// We need to split
		String arrayStr[]=str.split(";");
		//ArrayList<Integer> array=new ArrayList<>();
        /*for(String str1 : arrayStr)
        {
        	list.add(str1);
        }*/
		list=Arrays.asList(arrayStr);
        store.setList(list);
       List<String> listAfterRead=store.getList(); 
        System.out.println("The list is ");
        for(String str2 : listAfterRead)
        {
        	System.out.println(str2);
        }
        
		
		
	}

	
	
}
