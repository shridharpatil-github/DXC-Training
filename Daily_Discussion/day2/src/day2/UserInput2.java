package day2;

import java.util.Scanner;

// Adding two integer values
public class UserInput2 {

	public static void main(String[] args) {
		
		int number1=0;
		int number2=0;
		int result=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number1");
		number1=scanner.nextInt(); 
		System.out.println("Enter the number2");
		number2=scanner.nextInt();
		result=number1+number2;
		System.out.println("The sum of "+number1+" and "+number2+" is "+result);
		
		
	}

}
