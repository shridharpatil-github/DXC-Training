package com.dxc.cricketmatch.user.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.zip.Deflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.cricketmatch.user.bcrypt.Encryption;
import com.dxc.cricketmatch.user.exception.UserNotFoundException;
import com.dxc.cricketmatch.user.model.User;
import com.dxc.cricketmatch.user.repository.UserRepository;

/**
 * @author Shreedharagowda
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private Encryption encrypt;

	@Override
	public boolean addUser(User user) throws UserNotFoundException {
		String email = user.getEmail();
//		System.out.println(email);
		Optional<User> userPresent = repository.findById(email);
//		System.out.println(userPresent.isPresent());
		if(!userPresent.isPresent()) {
			user.setPassword(encrypt.encoder(user.getPassword()));
			repository.save(user);
			return true;
		}else {
			throw new UserNotFoundException("User Found");
		}
	}

	@Override
	public User login(String email, String password) throws UserNotFoundException {
//		User user = repository.findById(email).get();
		Optional<User> userPresent = repository.findById(email);
		User user;
		if(!userPresent.isPresent()) {
			throw new UserNotFoundException("Email is not Registered");
			
		} else if (userPresent.isPresent()) {
			user = userPresent.get();
			if(encrypt.match(password, user.getPassword())) {
				return user;
			}
		}
		return null;	
	}
	
	
	@Override
	public User getUserDetails(String email) throws UserNotFoundException {
		Optional<User> userPresent = repository.findById(email);
		
		if(userPresent.isPresent()) {
			User user = userPresent.get();
			return user;
		}
		else {
			throw new UserNotFoundException("user not found");
		}
	}
	
	@Override
	public boolean updateUserDetails(User user) throws UserNotFoundException {
		Optional<User> userPresent = repository.findById(user.getEmail());
		
		if(userPresent.isPresent()){
			User user2 = userPresent.get();
			if(user.getFirstName() != null) {
				user2.setFirstName(user.getFirstName());
			}
			if(user.getLastName() != null) {
				user2.setLastName(user.getLastName());
			}
			if(user.getMobileNumber() != null) {
				user2.setMobileNumber(user.getMobileNumber());
			}
			if(user.getPassword()!=null) {
				user2.setPassword(encrypt.encoder(user.getPassword()));
			}
			
			repository.save(user2);
			return true;
		}else {
			throw new UserNotFoundException("user not found");
		}
	}
	
	/**
	 * @param data
	 * @return byte
	 */
	public static byte[] compressBytes(byte[] data) {
		Deflater deflater = new Deflater();
		deflater.setInput(data);
		deflater.finish();
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		while (!deflater.finished()) {
			int count = deflater.deflate(buffer);
			outputStream.write(buffer, 0, count);
		}
		try {
			outputStream.close();
		} catch (IOException e) {
		}
		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);
		return outputStream.toByteArray();
	}
}
