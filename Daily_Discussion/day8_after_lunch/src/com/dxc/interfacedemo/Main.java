package com.dxc.interfacedemo;

public class Main {

	// We cannot create an object of interface
	// but we can create a reference variable
	// of interface , in our example calc is
	// a reference variable of Calculator type
	// It can store the address of the object of
	// the class which has implemented the interface.
	
	public static void main(String[] args) {
		Calculator calc=new MyNumber();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.substract(4, 2));
	  // displayNumber is not declared in the Calculator
		// interface as it is a specific method of the
		// MyNumber class
		//calc.displayNumber();

		MyNumber number=(MyNumber)calc;
	    number.dislayNumber();
	}

}
