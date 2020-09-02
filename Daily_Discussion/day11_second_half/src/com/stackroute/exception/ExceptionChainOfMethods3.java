package com.stackroute.exception;

class Data3
{
	
	public void method1()
	{
		try
		{
		method2();
		}catch(NullPointerException exception)
		{
			System.out.println(exception.getMessage());
		}
	}

	private void method2() {
		
		method3();
		
	}

	private void method3() {
		
		int i=10;
		int j=0;
		int result=i/j;
		
	}
	
}

public class ExceptionChainOfMethods3 {

	public static void main(String str[])
	{
             Data3 data=new Data3();
             data.method1();
	}
}
