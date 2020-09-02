package com.dxc.interfacedemo;

// If we implement an interface
// we need to override all the abstract
// methods of the interface
// otherwise the code gives compiltion error

public class MyNumber implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

   public void dislayNumber()
   {
	   System.out.println("The display Number is called");
   }

}
