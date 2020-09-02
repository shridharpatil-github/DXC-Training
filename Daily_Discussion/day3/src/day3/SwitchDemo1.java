package day3;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		int weekDays=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value between 1 to 7");
		weekDays=scan.nextInt();
		switch(weekDays)
		{
		case 1 : System.out.println("Sunday");
		         break;
		case 2 : System.out.println("Monday");
		         break;
		
		default : System.out.println("The value is incorrect");
		}
		
		}
	}


