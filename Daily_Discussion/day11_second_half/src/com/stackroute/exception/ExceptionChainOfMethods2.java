package com.stackroute.exception;

class Data2
{
	
	public void method1()
	{
		try
		{
		method2();
		}catch(Exception exception)
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

public class ExceptionChainOfMethods2 {

	public static void main(String str[])
	{
             Data2 data=new Data2();
             data.method1();
	}
}
