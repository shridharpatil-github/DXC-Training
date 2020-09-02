package com.isarelationship;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// Just create 2 Employee objects
		// one will use default constructor
		// one will use parameterized constructor
		Scanner scanner=new Scanner(System.in);
		Employee employee1=new Employee();
		System.out.println(employee1.getAge());
		System.out.println(employee1.getName());
		System.out.println(employee1.getId());
		System.out.println(employee1.getDesig());
		System.out.println(employee1.getDept());
		System.out.println(employee1.getBasic());
		
		System.out.println("After accepting the value from user");
		System.out.println("Enter the age");
		employee1.setAge(scanner.nextInt());
		System.out.println("Enter the name");
		employee1.setName(scanner.next());
		System.out.println("Enter the designation");
		employee1.setDesig(scanner.next());
		System.out.println("Enter the department");
		employee1.setDept(scanner.next());
		System.out.println("Enter the basic");
		employee1.setBasic(scanner.nextInt());
		
		System.out.println("The details are");
		System.out.println(employee1.getAge());
		System.out.println(employee1.getName());
		System.out.println(employee1.getId());
		System.out.println(employee1.getDesig());
		System.out.println(employee1.getDept());
		System.out.println(employee1.getBasic());
		// So through parameterized constructor we need to pass 6 details
		// Employee(age,name,id,desig,dept,basic)
		Employee employee2=new Employee(34,"John",1000,"AsstMgr","HR",34000);
		System.out.println(employee2.getId());
		System.out.println(employee2.getAge());
		System.out.println(employee2.getName());
		System.out.println(employee2.getDesig());
		System.out.println(employee2.getDept());
		System.out.println(employee2.getBasic());
		
	}

}
