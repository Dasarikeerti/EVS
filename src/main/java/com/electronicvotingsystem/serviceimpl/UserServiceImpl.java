package com.electronicvotingsystem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronicvotingsystem.entity.User;
import com.electronicvotingsystem.exception.UserNotFoundException;
import com.electronicvotingsystem.repository.UserRepository;
import com.electronicvotingsystem.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User loginUser(String userName, String password) throws UserNotFoundException {
		User user = userRepository.findByUserNameAndPassword(userName, password);
		if(user==null)
		{
			throw new UserNotFoundException("Invalid User");
		}
		return user;
	}

}
