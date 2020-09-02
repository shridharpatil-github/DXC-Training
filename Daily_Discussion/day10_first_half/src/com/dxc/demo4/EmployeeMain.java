package com.dxc.demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// CRUD
// Create
// Read
// Update
// Delete
public class EmployeeMain {

	public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   List<Employee> employeeList=new ArrayList<>();
   int ch=0;
   while(true)
   {
	   System.out.println("1) ADD EMPLOYEE");
	   System.out.println("2) DISPLAY ALL EMPLOYEES");
	   System.out.println("3) DELETE EMPLOYEE");
	   System.out.println("4) UPDATE EMPLOYEE");
	   System.out.println("5) EXIT");
	   System.out.println("Enter your choice");
	   ch=scanner.nextInt();
	   switch(ch)
	   {
	   case 1 : Employee employee=new Employee();
	            System.out.println("Enter the id");
	            //int id=scanner.nextInt();
	            employee.setId(scanner.nextInt());
	            System.out.println("Enter the name");
	            employee.setName(scanner.next());
	            System.out.println("Enter the designation");
	            employee.setDesignation(scanner.next());
	            System.out.println("Enter the department");
	            employee.setDepartment(scanner.next());
	            // adding the newly created object to the list
	            employeeList.add(employee);
	            break;
	   case 2 : for(Employee emp : employeeList)
	              {
		           System.out.format("|%6d|%-20s|%-20s|%-20s|\n",emp.getId(),emp.getName(),emp.getDesignation(),emp.getDepartment());
	              }
	            break;
	   case 3 : System.out.println("Enter the id to be deleted");
	            int id=scanner.nextInt();
	            boolean found=false;
	            // Iterator to delete
	            Iterator<Employee> iterator=employeeList.iterator();
	            while(iterator.hasNext())
	            {
	            	Employee emp=iterator.next();
	                if(emp.getId()==id)
	                {
	                	iterator.remove();
	                	found=true;
	                	break;
	                }
	            }
	            if(!found)
	            {
	            	System.out.println("Not found!!!");
	            }
	            break;
	   case 4 : System.out.println("Enter the id to update");
	             int idToUpdate=scanner.nextInt();
	             Iterator<Employee> iterator1=employeeList.iterator();
		            while(iterator1.hasNext())
		            {
		            	
		            	Employee emp=iterator1.next();
		            	if(emp.getId()==idToUpdate)
		                {   
		            		System.out.println("The name is "+emp.getName());
		            		System.out.println("Enter the changed name");
		            		emp.setName(scanner.next());
		            		break;
		                }
		            }
	             break;
	   case 5 : System.exit(0);
	   }
   }
   
	
		

	}

}
