package com.dxc.cricketmatch.exception;

/**
 * @author Shreedharagowda
 * MatchNotFoundException throw the exception when try to delete match which is not present 
 * database
 */
public class MatchNotFoundException extends Exception {

	/**
	 * @param message 
	 * 
	 */
	public MatchNotFoundException(String message) {
		super(message);
	}
}
