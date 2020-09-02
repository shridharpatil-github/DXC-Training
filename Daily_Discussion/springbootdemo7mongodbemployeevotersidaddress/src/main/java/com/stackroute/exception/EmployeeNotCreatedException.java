package com.stackroute.exception;

public class EmployeeNotCreatedException extends Exception {
    
	private static final long serialVersionUID = 1L;

	public EmployeeNotCreatedException(String message) {
        super(message);
    }
}
