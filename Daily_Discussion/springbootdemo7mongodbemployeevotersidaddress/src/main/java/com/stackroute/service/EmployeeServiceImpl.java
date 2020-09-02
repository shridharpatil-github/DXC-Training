package com.stackroute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.exception.EmployeeNotCreatedException;
import com.stackroute.exception.EmployeeNotFoundException;

import com.stackroute.model.Employee;
import com.stackroute.model.VotersIdCard;
import com.stackroute.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) throws EmployeeNotCreatedException {
		
		Optional<Employee> searchEmployee= employeeRepository.findById(employee.get_id());
		if (searchEmployee.isPresent()) {
			throw new EmployeeNotCreatedException("Employee not created!!!");
		}
		employeeRepository.insert(employee);
		
		return employee;
	}

	@Override
	public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException {
		Optional<Employee> searchEmployee= employeeRepository.findById(employeeId);
		if (!searchEmployee.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found for deletion!!!");
		}
		employeeRepository.delete(searchEmployee.get());
		return true;
	}

	@Override
	public Employee updateEmployee(int employeeId, Employee employee) throws EmployeeNotFoundException {
		Optional<Employee> searchEmployee = employeeRepository.findById(employeeId);
		if (!searchEmployee.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found for update");
		}
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException {
		Optional<Employee> searchEmployee = employeeRepository.findById(employeeId);
		if (!searchEmployee.isPresent()) {
			throw new EmployeeNotFoundException("Employee not found");
		}
		return searchEmployee.get();
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList=employeeRepository.findAll();
		   return employeeList;
	}
	
	

}
