package com.stackroute.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.exception.EmployeeDoesNoteExistsException;
import com.stackroute.exception.EmployeeNotCreatedException;
import com.stackroute.exception.EmployeeNotFoundException;

import com.stackroute.model.Employee;
import com.stackroute.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	
	
	@Override
	public Employee createEmployee(Employee employee) throws EmployeeNotCreatedException {
		
		
		Employee createEmployee=employeeRepository.insert(employee);
		if(createEmployee!=null) {
		return createEmployee;
		}else
		{
			throw new EmployeeNotCreatedException("Employee Not Created");
		}
	}

	
	
	
	@Override
	public boolean deleteEmployee(int employeeId) throws EmployeeDoesNoteExistsException {
		   Employee found=employeeRepository.findById(employeeId).get();
		   if(found==null)
		   {
			throw new EmployeeDoesNoteExistsException("CategoryDoesNoteExistsException");
		   }
		   else
		   {
			employeeRepository.delete(found);
		   }
		   
		   return true;
	}

	@Override
	public Employee updateEmployee(Employee employee,int employeeId) {
		 Employee employeeToUpdate= employeeRepository.findById(employeeId).get();
		 if(employeeToUpdate!=null)
		 {
		 employeeRepository.save(employee);
		 }
		 return employee;
		 
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	
	public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException {
		try {
			if (employeeRepository.findById(employeeId).isPresent()) {
				return employeeRepository.findById(employeeId).get();

			} else {
				throw new EmployeeNotFoundException("CategoryNotFoundException");
			}
		} catch (NoSuchElementException ex) {
			throw new EmployeeNotFoundException("CategoryNotFoundException");
		}
	}



	

}
