package com.hasarelationship;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String strr[])
	{
		Scanner scanner=new Scanner(System.in);
		Name name=new Name();
		Address address=new Address();
		Employee employee=new Employee();
		
		System.out.println("Enter the employee's id");
		employee.setId(scanner.nextInt());
		System.out.println("Enter the name details");
		System.out.println("Enter the first name");
		name.setFirstName(scanner.next());
		System.out.println("Enter the middle name");
		name.setMiddleName(scanner.next());
		System.out.println("Enter the last name");
		name.setLastName(scanner.next());
		
		employee.setName(name);
		
		System.out.println("Enter the address details");
		System.out.println("Enter the house number");
		address.sethNo(scanner.nextInt());
		System.out.println("Enter the street name");
		address.setStreetName(scanner.next());
		System.out.println("Enter the city name");
		address.setCity(scanner.next());
		System.out.println("Enter the locality");
		address.setLocality(scanner.next());
		
		employee.setAddress(address);
		
		System.out.println("The details");
		System.out.println("The id "+employee.getId());
		System.out.println("The name "+employee.getName());
		System.out.println("The address " + employee.getAddress());
		
		
		
		
		
		
		
	}
}
