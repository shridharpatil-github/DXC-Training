package com.stackroute.regex;

import java.util.Scanner;

// ctrl+shift+0 ( shrtcut for import )

/* \\d */
public class MobileValidation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String mobileNo=scanner.next();
		if(mobileNo.matches("\\d+"))
		{
			System.out.println("Valid!!!!");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
