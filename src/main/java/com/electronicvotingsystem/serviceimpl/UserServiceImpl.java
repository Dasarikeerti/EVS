package com.electronicvotingsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.electronicvotingsystem.entity.User;
import com.electronicvotingsystem.exception.UserNotFoundException;
import com.electronicvotingsystem.repository.UserRepository;
import com.electronicvotingsystem.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User loginUser(String userName, String password) throws UserNotFoundException {
		User User = userRepo.findByUserNameAndPassword(userName, password);
		if(User==null)
		{
			throw new UserNotFoundException("Invalid User");
		}
		return User;
	}

}
