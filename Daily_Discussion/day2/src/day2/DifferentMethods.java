package day2;

import java.util.Scanner;

// accept the value in main method
// write a method to add numbers and display in the method itself
// addNumbers(int num1, int num2)

public class DifferentMethods {

	
	
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number1");
		number1=scanner.nextInt();
		System.out.println("Enter number2");
		number2=scanner.nextInt();
		addNumbers(number1,number2);
		

	}

	private static void addNumbers(int number1, int number2) {
		int result=number1+number2;
		System.out.println("The sum is "+result);
		
	}

}
