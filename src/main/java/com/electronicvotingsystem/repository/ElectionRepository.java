package com.electronicvotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electronicvotingsystem.entity.Election;
@Repository
public interface ElectionRepository extends JpaRepository<Election,Integer> {

}
