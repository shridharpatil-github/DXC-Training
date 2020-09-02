package com.stackroute.employee.dao;

import java.util.List;

import com.stackroute.keepnote.model.Employee;



public interface EmployeeDAO {
	
	/* You Should not modify this interface.  You have to implement these methods in corresponding Impl class*/

	public boolean saveEmployee(Employee employee);

	public boolean deleteEmployee(int employeeId);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int employeeId);

	public boolean updateEmployee(Employee employee);

}
