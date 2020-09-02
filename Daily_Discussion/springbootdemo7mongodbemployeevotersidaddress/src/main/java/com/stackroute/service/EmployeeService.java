package com.stackroute.service;

import java.util.List;

import com.stackroute.exception.EmployeeNotCreatedException;
import com.stackroute.exception.EmployeeNotFoundException;

import com.stackroute.model.Employee;


public interface EmployeeService {

	 public Employee createEmployee(Employee employee) throws EmployeeNotCreatedException;
	 public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException;
	 public Employee updateEmployee(int employeeId, Employee employee) throws EmployeeNotFoundException;
	 Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException;
	 public List<Employee> getAllEmployees();
	 
}


