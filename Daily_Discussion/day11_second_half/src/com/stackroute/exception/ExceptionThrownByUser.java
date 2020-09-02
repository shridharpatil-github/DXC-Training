package com.stackroute.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionThrownByUser {
// If the input value is 0
// Throw IOException
	// throw---> explictly creating
	//and throwing exception object
	public static void main(String[] args)  {
		try
		{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		if(num==0)
		{
			throw new IOException("Value cannot be 0!!!");
			/* IOException exception=new IOException("Value cannot be 0");
			throw exception; */
		}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
