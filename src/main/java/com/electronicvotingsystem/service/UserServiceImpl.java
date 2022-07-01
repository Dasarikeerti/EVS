package com.eletronicvotingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eletronicvotingsystem.entity.User;
import com.eletronicvotingsystem.exception.UserNotFoundException;
import com.eletronicvotingsystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	// validate Users
	@Override
	public User loginUser(String userName, String password) {

		User User = userRepo.findByUserNameAndPassword(userName, password);
		if (User == null) {
			throw new UserNotFoundException("Invalid User");
		}
		return User;
	}

}
