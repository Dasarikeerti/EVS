package com.eletronicvotingsystem.service;

import com.eletronicvotingsystem.entity.User;
import com.eletronicvotingsystem.exception.UserNotFoundException;

public interface UserService {

	//user validation
	public User loginUser(String userName, String password)throws UserNotFoundException;
		
}
