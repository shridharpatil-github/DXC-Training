package day3;

import java.util.Scanner;

// access specifiers
// default ( if we are not using any specifier and accessible within the package)
// private ( the members are visible/accessible inside the class)
// public  ( The members are accessible outside the class)
// protected  ( The members are accessible by the derived classes)

// member variables/attributes are private
// member methods are public
public class Calculator4 {
// member attributes
 private int num1;
 private int num2;
 private int result;
 
 // member methods
 public void setData()
 {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter num1");
	 num1=scanner.nextInt();
	 System.out.println("Enter num2");
	 num2=scanner.nextInt();
	 
 }
 
 public void displayData()
 {
	 System.out.println("The value for num1  "+num1);
	 System.out.println("The value for num2   "+num2);
 }
 
 public void add()
 {
	 result=num1+num2;
	 System.out.println("The result of add "+result);
 }
 public void subtract()
 {
	 result=num1-num2;
	 System.out.println("The result of subtract "+result);
 }
}
