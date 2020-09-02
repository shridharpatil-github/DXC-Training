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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.exception.EmployeeDoesNoteExistsException;
import com.stackroute.exception.EmployeeNotCreatedException;
import com.stackroute.exception.EmployeeNotFoundException;

import com.stackroute.model.Employee;
import com.stackroute.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
		try {
			
			Employee employeeCreated = employeeService.createEmployee(employee);
			if (employeeCreated != null) {
				return new ResponseEntity<>(employee, HttpStatus.CREATED);
			}
		} catch (EmployeeNotCreatedException e) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(employee, HttpStatus.CREATED);
	}
	
	 
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("id") int id) {
		try {
			if (employeeService.deleteEmployee(id)){
				return new ResponseEntity<>(HttpStatus.OK);
			}

		} catch (EmployeeDoesNoteExistsException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}
	 
	 
	  
	  @GetMapping("/displayaAllEmployees")
		public ResponseEntity<?> getAllEmployees() {
			List<Employee> employees=employeeService.getAllEmployees();
			return new ResponseEntity<>(employees,HttpStatus.OK);
		}
	  
	
	  @PutMapping("/updateEmployee/{id}")
		public ResponseEntity<?> updateCategory(@RequestBody Employee employee, @PathVariable("id") int id) {

			
			Employee updated = employeeService.updateEmployee(employee, id);
			if (updated != null) {
				return new ResponseEntity<>(employee, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.CONFLICT);
			}
		}
	  
	  @GetMapping("/getEmployeeById/{id}")
		public ResponseEntity<?> getEmployeeById(@PathVariable("id") int id) {
			Employee employee = null;
			try {
				employee = employeeService.getEmployeeById(id);
				if (employee != null) {
					return new ResponseEntity<>(employee, HttpStatus.OK);
				}
			} catch (EmployeeNotFoundException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	  
}
