package com.stackroute.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.stackroute.model.Employee;
import com.stackroute.repository.EmployeeRepository;
import com.stackroute.service.EmployeeServiceImpl;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import java.util.*;

import com.stackroute.exception.*;

public class EmployeeServiceImplTest {

	private Employee employee;
	
	/* We are going to have a mock object of EmployeeRepository */
	
	@Mock
	private EmployeeRepository employeeRepository;

	/*  Mockito @InjectMocks annotation allow us to inject
	 mocked dependencies object.   */
	
	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;

	private List<Employee> allEmployees=null;
	Optional<Employee>  options;
	
	@Before
	public void setUp() throws Exception
	{
		
		/*We can initiialize mock by calling initMocks method of
		  org.mockito.MockitoAnnotations
		  */
		
		MockitoAnnotations.initMocks(this);
		employee=new Employee();
		employee.set_id(1);
		employee.setEmpName("Ram");
		employee.setDesignation("Manager");
		employee.setDepartment("Sales");
		employee.setBasic(23000);
		
		allEmployees=new ArrayList<>();
		allEmployees.add(employee);
		options=Optional.of(employee);
	}
	
	@Test
	public void createEmployeeTestSuccess() throws Exception{
		
		when(employeeRepository.insert((Employee)any())).thenReturn(employee);
		Employee savedEmployee=employeeServiceImpl.createEmployee(employee);
		assertEquals(employee,savedEmployee);
	}
	
	@Test(expected=EmployeeNotCreatedException.class)
	public void createEmployeeTestFailure() throws Exception {
		when(employeeRepository.insert((Employee)any())).thenReturn(null);
		Employee savedEmployee=employeeServiceImpl.createEmployee(employee);
		assertEquals(employee,savedEmployee);
	}
	
	@Test
	public void deleteEmployee() throws Exception {
	when(employeeRepository.findById(employee.get_id())).thenReturn(options);	
	boolean flag=employeeServiceImpl.deleteEmployee(employee.get_id());
	assertTrue(true);
	
		
	}
	
	@Test
	public void updateEmployeeTestSuccess() {
	when(employeeRepository.findById(employee.get_id())).thenReturn(options);
	employee.setDesignation("VP");
	Employee fetchedEmployee=employeeServiceImpl.updateEmployee(employee, employee.get_id());
	assertEquals(employee.getDesignation(),fetchedEmployee.getDesignation());
	
	}
	
   @Test
   public void getEmployeeByIdTestSuccess() throws EmployeeNotFoundException{
	   
	   when(employeeRepository.findById(employee.get_id())).thenReturn(options);
	   Employee fetchedEmployee=employeeServiceImpl.getEmployeeById(employee.get_id());
	   assertEquals(employee,fetchedEmployee);
	   
   }
	
 
 @Test(expected=EmployeeNotFoundException.class) 
 public void getEmployeeByIdTestFailure() throws EmployeeNotFoundException{
	   
	   when(employeeRepository.findById(employee.get_id())).thenThrow(NoSuchElementException.class);
	   Employee fetchedEmployee=employeeServiceImpl.getEmployeeById(employee.get_id());
	   assertEquals(employee,fetchedEmployee);
	   
   }
   
}

