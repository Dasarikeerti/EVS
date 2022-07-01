package com.electronicvotingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronicvotingsystem.entity.User;
import com.electronicvotingsystem.service.UserService;
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/login")
	public User login(@RequestBody User user) {
		String userName = user.getUserName();
		String password = user.getPassword();
		return userService.loginUser(userName, password);
	}

}
