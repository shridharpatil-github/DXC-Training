package com.stackroute.exception;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		try
		{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
	   if(num==0)
	   {
		   throw new ZeroValueNotAllowedException("0 value not allowed!!!");
	   }
		}catch(ZeroValueNotAllowedException exception)
		{
			System.out.println(exception.getMessage());
		}
		
		}

}
