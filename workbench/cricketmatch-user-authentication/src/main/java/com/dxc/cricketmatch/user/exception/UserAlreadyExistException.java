package com.dxc.cricketmatch.user.exception;

/**
 * @author Devansh
 *
 */
public class UserAlreadyExistException extends Exception {

	/**
	 * @param message
	 */
	public UserAlreadyExistException(String message) {
		super(message);
	}
}
