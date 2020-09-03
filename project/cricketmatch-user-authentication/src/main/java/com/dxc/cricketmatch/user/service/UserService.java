package com.dxc.cricketmatch.user.service;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.web.multipart.MultipartFile;

import com.dxc.cricketmatch.user.exception.UserNotFoundException;
import com.dxc.cricketmatch.user.model.User;

/**
 * @author Debayan
 *
 */
public interface UserService {

	/**
	 * @param user
	 * @return boolean value
	 * @throws UserNotFoundException 
	 */
	public boolean addUser(User user) throws UserNotFoundException;
	
	/**
	 * @param email
	 * @param password 
	 * @return user details
	 * @throws UserNotFoundException 
	 */
	public User login(String email, String password) throws UserNotFoundException;
	
	/**
	 * @param email
	 * @return User
	 * @throws UserNotFoundException 
	 */
	public User getUserDetails(String email) throws UserNotFoundException;
	
	
	/**
	 * @param emailOS
	 * @param user
	 * @param image 
	 * @return boolean
	 * @throws UserNotFoundException 
	 */
	public boolean updateUserDetails(User user) throws UserNotFoundException;
}
