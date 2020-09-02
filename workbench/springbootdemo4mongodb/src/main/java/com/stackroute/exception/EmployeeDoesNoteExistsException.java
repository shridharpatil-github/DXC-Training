package com.stackroute.exception;

public class EmployeeDoesNoteExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeDoesNoteExistsException(String message) {
        super(message);
    }
}
