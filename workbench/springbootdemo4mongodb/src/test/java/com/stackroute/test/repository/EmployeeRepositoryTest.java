package com.stackroute.test.repository;

import static org.junit.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stackroute.model.Employee;
import com.stackroute.repository.EmployeeRepository;


/* 
 * @RunWith(SpringRunner.class) tells JUnit
 * to run using's Spring's testing support 
 * */
@RunWith(SpringRunner.class)

/* We are testing for MongoDB */
@DataMongoTest
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;
	private Employee employee;
	
	@Before
	public void setUp() throws Exception
	{
		employee=new Employee();
		employee.set_id(1);
		employee.setEmpName("Ram");
		employee.setDesignation("Manager");
		employee.setDepartment("Sales");
		employee.setBasic(12000);
	}
	
	@After
	public void tearDown() throws Exception{
		employeeRepository.deleteAll();
	}
	
	// CREATE testcase for CRUD operation
	@Test
	public void createEmployeeTest()
	{
		// currently we are testing with the employee object initialised in the setUp method
		employeeRepository.insert(employee);
		Employee fetchedEmployee=employeeRepository.findById(employee.get_id()).get();
		assertEquals(1,fetchedEmployee.get_id());
	}
	
	// DELETE testcase for CRUD operation 
   @Test(expected=NoSuchElementException.class)
	public void deleteEmployeeTest() {
		// 1) Inserting one record
	     employeeRepository.insert(employee);
	     // 2) Fetch the record to be deleted!!!!
	     Employee fetchedEmployee=employeeRepository.findById(employee.get_id()).get();
	     assertEquals(1,fetchedEmployee.get_id());
	     // 3) Delete the record!!!
	     employeeRepository.delete(fetchedEmployee);
	     fetchedEmployee=employeeRepository.findById(employee.get_id()).get();
   }
   
   
	// Update testcase for CRUD operation
   @Test
	 public void updateEmployeeTest()
	 {
	   // 1) Inserting a record so that we can update the inserted record
		employeeRepository.insert(employee); 
		// fetching the record which we want to update
		Employee fetchedEmployee=employeeRepository.findById(employee.get_id()).get();
		assertEquals(1,fetchedEmployee.get_id());
		// We are trying to update the designation
		fetchedEmployee.setDesignation("VP");
		// save the data with the change
		employeeRepository.save(fetchedEmployee);
		// after saving fetch the employee once again to check whether the designation got updated!!!
		fetchedEmployee=employeeRepository.findById(employee.get_id()).get();
		assertEquals("VP",fetchedEmployee.getDesignation());
		
	 }
	
	// READ testcase for CRUD operation
   @Test
   public void getEmployeeByIdTest()
   {
	//1) Inserting the record
	   employeeRepository.insert(employee);
	// 2) Fetch the record   
	   Employee fetchedEmployee=employeeRepository.findById(employee.get_id()).get();
	 // assert
	   assertEquals(1,fetchedEmployee.get_id());
   }
	
	
}
