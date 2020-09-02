package day3;

import java.util.Scanner;
// In this example we have both parameterized constructor
// and the default constructor

public class Person1 {
     private int age;
     private String name;
     public Person1()
     {
    	 age=1;
    	 name="Shanti";
     }
     
     public Person1(int a,String n)
     {
    	 age=a;
    	 name=n;
     }
     
     public void setData()
     {
    	 Scanner scan=new Scanner(System.in);
    	 System.out.println("Enter the age of the person");
    	 age=scan.nextInt();
    	 System.out.println("Enter the name of the person");
    	 name=scan.next();
     }
     public void displayData()
     {
    	 System.out.println("The age is "+age);
    	 System.out.println("The name is "+name);
     }
     
}
