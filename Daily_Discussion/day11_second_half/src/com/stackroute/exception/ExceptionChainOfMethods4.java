package com.stackroute.exception;

class Data4
{
	
	public void method1()
	{
		try
		{
		method2();
		}catch(Exception exception)
		{
			System.out.println("I am in exception");
			System.out.println(exception.getMessage());
		}
	}

	private void method2() {
		
		try
		{
		method3();
		}catch(ArithmeticException ex)
		{
			System.out.println("I am within ArithmeticException");
			System.out.println(ex.getMessage());
		}
	}

	private void method3() {
		
		int i=10;
		int j=0;
		int result=i/j;
		
	}
	
}

public class ExceptionChainOfMethods4 {

	public static void main(String str[])
	{
             Data4 data=new Data4();
             data.method1();
	}
}
