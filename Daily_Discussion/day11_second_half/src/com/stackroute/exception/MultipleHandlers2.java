package com.stackroute.exception;
// The following code
// is having error because 
// we kept the Exception as an handler
// first , so it will handle all the exceptions
// rest of the code remain unreachable
// In programming language , unreachable
// code is compilation error
public class MultipleHandlers2 {

	public static void main(String[] args) {
	
		int i=10;
		int j=0;
		int result;
		try
		{
			result=i/j;
			
		}catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
		}
		catch(NullPointerException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
