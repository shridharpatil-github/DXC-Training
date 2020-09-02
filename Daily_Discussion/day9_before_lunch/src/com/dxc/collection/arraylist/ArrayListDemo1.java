package com.dxc.collection.arraylist;

import java.util.ArrayList;
class Employee
{
	
	/*
	 *   public String toString(){
	 *   
	 *     return "String";
	 *   }
	 * 
	 * 
	 * 
	 */
	
	
	
}
// object points to string
// Object object=new Person();
// String str="welcome"
// Object object=str;

// boolean add(Object object)
public class ArrayListDemo1 {

	public static void main(String[] args) {

      ArrayList names=new ArrayList();
      names.add("Ravi");
      names.add("Ashok");
      names.add("Anil");
      
      System.out.println(names);
      System.out.println(names.toString());
      System.out.println("--------------");
		// The following foreach loop is an error
      /*
		 * for(String name : names) {
		 *    
		 * }
		 */
       for(Object objString : names)
       {
    	   String name=(String)objString;
    	   System.out.println(name);
       }
       
      
     //Employee employee=new Employee();
     //System.out.println(employee);
     //System.out.println(employee.toString());// com.dxc.collection.arraylist.Employee@15db9742
	}

}
