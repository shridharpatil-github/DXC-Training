package com.dxc.cricketmatch.user.response;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import com.dxc.cricketmatch.user.model.User;

/**
 * @author Shreedharagowda
 * CricketMatchResponse is model class for response from boot api 
 * it will helpful for send response in better way 
 *
 */
public class UserResponse {
	
	private HttpStatus httpStatus;
	private String message;
	private String email;
	private String token;
	private User user;
	
	
	
	
	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return httpStatus 
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	/**
	 * @param httpStatus set the HttpStatus
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
	/**
	 * @return message 
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @param message set the message 
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 */
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
