package com.eletronicvotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eletronicvotingsystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserNameAndPassword(String username, String password);

	public boolean existsByUserName(String userName);

}
