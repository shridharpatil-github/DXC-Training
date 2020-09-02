package com.dxc.demo1;
import java.util.*;  
public class CollectionsCopyExample1 {  
    public static void main(String[] args) {  
        //Create lists for source and destination      
          List<String> srclist = new ArrayList<String>();  
          List<String> destlist = new ArrayList<String>();  
          //Populate two source and destination lists  
          srclist.add("Java Tutorial");  
          srclist.add("is best on");  
          srclist.add("JavaTpoint");  
          destlist.add("JavaTpoint");  
          destlist.add("is older than");  
          destlist.add("SSSIT");  
          // copy into destination list  
          Collections.copy(destlist, srclist);              
          System.out.println("Elements of source list: "+srclist);  
          System.out.println("Elements of destination list: "+destlist);  
          }  
}  