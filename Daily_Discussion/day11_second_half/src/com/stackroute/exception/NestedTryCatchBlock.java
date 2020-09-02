package com.stackroute.exception;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try
		{
			try
			{
			int i=10;
			int j=0;
			int resut=i/j;
			}catch(ArithmeticException ar)
			{
				System.out.println("Inner catch");
				System.out.println(ar.getMessage());
			}
		}catch(Exception exception)
		{
			System.out.println("Outer catch");
			System.out.println(exception.getMessage());
		}
		

	}

}
