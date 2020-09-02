package com.dxc.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collection interface
// Collections class
// 

// for fill we should have some data
// which will be overwritten

public class CollectionsDemo1 {

	public static void main(String[] args) {
		 List<String> srclist = new ArrayList<String>();  
        
         	
			
			  srclist.add("Ram"); srclist.add("Rajib"); srclist.add("Ranjan");
			 
         System.out.println("Before fill");
         System.out.println(srclist);
         System.out.println("After fill");
         Collections.fill(srclist,"DXC");
         System.out.println(srclist);
         
	}

}
