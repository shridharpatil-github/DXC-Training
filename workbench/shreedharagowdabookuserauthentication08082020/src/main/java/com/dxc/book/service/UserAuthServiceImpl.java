package com.dxc.book.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.book.model.User;
import com.dxc.book.repo.UserAuthRepo;

public class UserAuthServiceImpl implements UserAuthService {

	@Autowired
	private UserAuthRepo repo;
	
	@Override
	public boolean addUser(User user) {
		repo.save(user);
		return true;
	}

	@Override
	public User findUser(String email) {
		User user = repo.findById(email).get();
		return user;
	}

}
