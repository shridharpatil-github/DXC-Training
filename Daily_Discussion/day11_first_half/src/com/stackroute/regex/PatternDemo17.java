package com.stackroute.regex;

import java.util.Scanner;

public class PatternDemo17 {

	public static void main(String[] args) {
		String pattern="\\d{10}";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		String mobile=scanner.next();
		if(mobile.matches(pattern))
		{
			System.out.println("Valid mobile number");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}

}
