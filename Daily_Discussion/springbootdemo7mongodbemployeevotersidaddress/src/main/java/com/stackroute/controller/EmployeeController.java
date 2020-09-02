package com.stackroute.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.stackroute.exception.EmployeeNotCreatedException;
import com.stackroute.exception.EmployeeNotFoundException;

import com.stackroute.model.Employee;
import com.stackroute.service.EmployeeService;


@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	
	@PostMapping(value = "/api/v1/employee/addEmployee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		
					
			try {
				employeeService.createEmployee(employee);
			} catch (EmployeeNotCreatedException e) {
				
				 return new ResponseEntity<String>("Conflict",HttpStatus.CONFLICT);
			}
				
		
			
			  return new ResponseEntity<Employee>(employee, HttpStatus.CREATED); 
			  }
			
			 
			


	
	@DeleteMapping("/api/v1/employee/deleteEmployee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int employeeId) {
		
		try {
			
			employeeService.deleteEmployee(employeeId);
		
			
		} catch (EmployeeNotFoundException e) {
			return new ResponseEntity<String>("Id Not found to delete!!",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("Id Deleted!!!!" ,  HttpStatus.OK);
	}

	
	@PutMapping("/api/v1/employee/updateEmployee/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable("id") int employeeId, @RequestBody Employee employee) {
		
		try {
			employeeService.updateEmployee(employeeId, employee);
			
			
		} catch (EmployeeNotFoundException e) {
			return new ResponseEntity<String>("Id not found!!!!",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("Id updated!!!!", HttpStatus.OK);
	}

	
	@GetMapping("/api/v1/employee/searchEmployee/{id}")
	public ResponseEntity<?> getEmployeeId(@PathVariable("id") int employeeId) {
		
		try {
			employeeService.getEmployeeById(employeeId);
		
			} catch (EmployeeNotFoundException  e) {
			return new ResponseEntity<String>("Employee Not Found!!!",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>("Found",HttpStatus.OK);
	}

	
	@GetMapping("/api/v1/employee/getAllEmployees")
	public ResponseEntity<?> getAllEmployees() {
	
		List<Employee> listEmployees =  employeeService.getAllEmployees();
		if (listEmployees.size()==0) {
			
			return new ResponseEntity<String>("List is empty",HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Employee>>(listEmployees, HttpStatus.OK);
	}
}
