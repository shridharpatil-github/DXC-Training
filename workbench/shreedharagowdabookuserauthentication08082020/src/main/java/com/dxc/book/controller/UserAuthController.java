package com.dxc.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.book.model.User;
import com.dxc.book.service.UserAuthService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user/api")
public class UserAuthController {

	@Autowired
	private UserAuthService service;
	
	@PostMapping("/addUser")
	public User addUser(@PathVariable User user) {
		
		if(service.addUser(user)) {
			return user;
		}
		return null;
	}
	
	@GetMapping("/getUser/{email}")
	public User findUser(@PathVariable String email) {
		User user = service.findUser(email);
		if(user != null) {
			return user;
		}
		return null;
	}
}

