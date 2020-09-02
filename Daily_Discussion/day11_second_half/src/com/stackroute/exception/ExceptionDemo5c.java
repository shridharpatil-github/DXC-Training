package com.stackroute.exception;

public class ExceptionDemo5c {

	// we cannot write only the try block
	// try block should be continued with 
	// catch block/blocks
	// or finally block
	public static void main(String[] args) {
		try
		{
		    int num1=10;
	    	int num2=0;
		    System.out.println("I am executed!!!");
		    int result=num1/num2;// throws an object of ArithmeticException
		      // ArithmeticException ex=new ArithmeticException();
		    System.out.println("I want to get executed!!!");
		}catch(ArithmeticException a)
		{
		// It show the error info just as it is being shown by the default handler
	    // printStackTrace is good durinf the time of development.
		// printStrackTrace shows all the stack details, so more memory intensive code
			a.printStackTrace();
		}
		
			
		
		}

}
