package com.electronicvotingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electronicvotingsystem.entity.ElectoralOfficer;
import com.electronicvotingsystem.model.ElectoralOfficerDTO;
@Repository
public interface ElectoralOfficerRepository extends JpaRepository<ElectoralOfficer,Integer> {

	

}
