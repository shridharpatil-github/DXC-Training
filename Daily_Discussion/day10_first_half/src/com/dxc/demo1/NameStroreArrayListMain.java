package com.dxc.demo1;

import java.util.ArrayList;
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
		ArrayList<String> list=new ArrayList<String>(); // 2 changes
		System.out.println("Enter the names separated by ;");
		String str=scanner.next();
		// We need to split
		String arrayStr[]=str.split(";");
		//ArrayList<Integer> array=new ArrayList<>();
        for(String str1 : arrayStr)
        {
        	list.add(str1);
        }
        store.setList(list);
       ArrayList<String> listAfterRead=store.getList(); // 1 change
        System.out.println("The list is ");
        for(String str2 : listAfterRead)
        {
        	System.out.println(str2);
        }
        
		
		
	}

	
	
}
