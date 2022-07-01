package com.electronicvotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electronicvotingsystem.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	//To validate the credentials of the user 
	public User findByUserNameAndPassword(String username,String password);
	
	//To have unique username 
	public boolean existsByUserName(String userName);
	
}
