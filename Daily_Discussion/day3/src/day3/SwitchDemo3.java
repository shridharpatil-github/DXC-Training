package day3;

import java.util.Scanner;
// Note:- switch expression can have 
//char,byte,short,int and String  

public class SwitchDemo3 {

	public static void main(String[] args) {
		int weekDays=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value between 1 to 7");
		weekDays=scan.nextInt();
		switch(weekDays)
		{
		default : System.out.println("The value is incorrect");
		          
		case 1 : System.out.println("Sunday");
		         break;
		case 2 : System.out.println("Monday");
		         break;
		
		
		}
		
		}
	}


