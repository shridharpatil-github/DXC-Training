package day3;

import java.util.Scanner;
// Note:- switch expression can have 
//char,byte,short,int and String  

public class SwitchDemo4 {

	public static void main(String[] args) {
		String weekDays;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of the weekday");
		weekDays=scan.next();
		switch(weekDays)
		{
		
		          
		case "sunday" : System.out.println("Day to take rest!!");
		         break;
		case "monday" : System.out.println("Day to work");
		
		         break;
		case "saturday" : System.out.println("Day to plan for taking rest");
		       break;
		default : System.out.println("The value is incorrect");
		}
		
		}
	}


