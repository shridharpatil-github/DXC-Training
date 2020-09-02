package com.dxc.interfacedemo2;


// In java a class cannot extend multiple classes
// In java we don't have multiple inheritance through 
// classes
/*
 *  In Java we dont have the below concept
 * 
 *   public class Base1{
 *   
 *   }
 *   
 *   public class Base2{
 *   
 *   }
 *   
 *   public class Derived extends Base1,Base2{
 *   
 *   }
 * 
 * 
 */

// But a class can implement mutiple interfaces
public class MyNumber implements Calculator1, Calculator2 {

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
