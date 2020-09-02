package com.stackroute.regex;

import java.util.Scanner;

public class PatternDemo19 {
// minimum 3 character
	// maximum 10
	public static void main(String[] args) {
		String pattern="\\d{3,}";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		String number=scanner.next();
		if(number.matches(pattern))
		{
			System.out.println("Valid number");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}

}
