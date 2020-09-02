package com.dxc.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collection interface
// Collections class
// 
public class CollectionsDemo3 {

	 // Collections works with list list only
	// Set cannot be used directly
	public static void main(String[] args) {
		 List<String> srclist = new ArrayList<String>();  
        
         	
         srclist.add("Ram");
         srclist.add("Rajib");
         srclist.add("Amit");
         System.out.println("Before sort");
         System.out.println(srclist);
         
         System.out.println("After sort");
         Collections.sort(srclist);
         System.out.println(srclist);
       
	}

}
