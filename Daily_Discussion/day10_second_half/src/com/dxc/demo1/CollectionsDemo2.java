package com.dxc.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collection interface
// Collections class
// 
// For copy the destination should have some content and the size of the 
// destination list should either greater or same of the source
public class CollectionsDemo2 {

	public static void main(String[] args) {
		 List<String> srclist = new ArrayList<String>();  
         List<String> destlist = new ArrayList<String>();
         destlist.add("novalue");
         destlist.add("novalue");
		 destlist.add("novalue");
		 destlist.add("novalue");
			 
         srclist.add("Ram");
         srclist.add("Rajib");
         srclist.add("Ranjan");
         
         System.out.println(srclist);
         System.out.println(destlist);
        /* for(String str : srclist)
         {
        	 destlist.add(str);
         }*/
         Collections.copy(destlist,srclist);
         System.out.println(srclist);
         System.out.println(destlist);		
         		

	}

}
