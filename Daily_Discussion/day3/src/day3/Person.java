package day3;

import java.util.Scanner;

public class Person {
     private int age;
     private String name;
     
     public Person()
     {
    	 age=21;
    	 name="Ram";
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
