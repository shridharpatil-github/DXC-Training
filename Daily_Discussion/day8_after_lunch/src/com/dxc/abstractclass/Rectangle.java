package com.dxc.abstractclass;

// It is mandatory for the classes
// which are inheriting the abstract
// should go for overriding the abstract
// method
// but overriding the non abstract method is
// not essential so as per our class
// defination we should override areaCalculate
// but overriding setX and setY is not essential
// If we are not overriding the abstract method
// make the derived class once again abstract
public class Rectangle extends Shape {

	
	  public int areaCalculate() {
		  int area; area=(x*y); 
		  return area; 
		  }
	 

}

/*
 * public abstract class Rectangle extends Shape{
 * 
 * 
 * public int areaCalculate() { int area; area=(x*y); return area; }
 * 
 * 
 * }
 */
