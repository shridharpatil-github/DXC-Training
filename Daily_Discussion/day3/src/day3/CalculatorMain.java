package day3;

import java.util.Scanner;

// We want to work with the class
// Calculator
// So for making the class usable
// we have to create an object of
// Calculator
public class CalculatorMain {
	public static void main(String[] args) {
	Calculator calc=new Calculator();
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first number");
    calc.num1=scan.nextInt();
    System.out.println("Enter the second number");
    calc.num2=scan.nextInt();
    calc.result=calc.num1+calc.num2;
    System.out.println(calc.result);
    }

}
