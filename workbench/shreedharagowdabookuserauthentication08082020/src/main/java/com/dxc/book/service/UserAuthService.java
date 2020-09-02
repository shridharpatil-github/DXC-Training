package com.dxc.book.service;

import com.dxc.book.model.User;

public interface UserAuthService {

	public boolean addUser(User user);
	public User findUser(String email);
	
}
