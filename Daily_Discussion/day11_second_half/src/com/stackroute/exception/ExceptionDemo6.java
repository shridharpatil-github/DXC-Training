package com.stackroute.exception;


public class ExceptionDemo6 {

	
	public static void main(String[] args) {
		try
		{
		    int num1=10;
	    	int num2=0;
		    System.out.println("I am executed!!!");
		    int result=num1/num2;// throws an object of ArithmeticException
		     
		    System.out.println("I want to get executed!!!");
		}catch(Exception a)  
		// In place of Exception we can write Throwable,RuntimeException also
		// In place of Exception we cannot write Object 
		{
		
			System.out.println(a.getMessage());
		}
		
			
		
		}

}
