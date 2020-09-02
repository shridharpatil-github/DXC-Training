package com.stackroute.service;

import java.util.List;

import com.stackroute.exception.EmployeeDoesNoteExistsException;
import com.stackroute.exception.EmployeeNotCreatedException;
import com.stackroute.exception.EmployeeNotFoundException;

import com.stackroute.model.Employee;

public interface EmployeeService {

	 public Employee createEmployee(Employee employee) throws EmployeeNotCreatedException;
	 public boolean deleteEmployee(int employeeId) throws EmployeeDoesNoteExistsException;
	 public Employee updateEmployee(Employee employee,int employeeId);
	 public List<Employee> getAllEmployees();
	 Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException;
	 
}
