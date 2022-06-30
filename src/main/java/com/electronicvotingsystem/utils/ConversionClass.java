package com.electronicvotingsystem.utils;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.electronicvotingsystem.entity.Election;
import com.electronicvotingsystem.entity.ElectoralOfficer;
import com.electronicvotingsystem.model.ElectionDTO;
import com.electronicvotingsystem.model.ElectoralOfficerDTO;

@Component
public class ConversionClass {

	// Converting Dto to entities to store in database collected from users;

	// ElectionDTO to Election entity to store
	public Election convertToElectionEntity(ElectionDTO electionDTO) {
		Election election = new Election();
		BeanUtils.copyProperties(electionDTO, election);
		
		return election;
	}

	// ElectoralOfficerDTO to ElectoralOfficer entity to store
	public ElectoralOfficer convertToElectoralOfficerEntity(ElectoralOfficerDTO electoralOfficerDTO) {
		ElectoralOfficer electoralOfficer = new ElectoralOfficer();
		BeanUtils.copyProperties(electoralOfficerDTO, electoralOfficer);

		return electoralOfficer;
	}

	
	// Converting Entities to DTO objects to display to the users;

	// Election to ElectionDTO to display to users
	public ElectionDTO convertToElectionDTO(Election election) {
		ElectionDTO electionDto = new ElectionDTO();
		BeanUtils.copyProperties(election, electionDto);

		return electionDto;

	}

	// ElectoralOfficerDTO to ElectoralOfficer entity to display to user
	public ElectoralOfficerDTO convertToElectoralOfficerDTO(ElectoralOfficer electoralOfficer) {
		ElectoralOfficerDTO electoralOfficerDto = new ElectoralOfficerDTO();
		BeanUtils.copyProperties(electoralOfficer, electoralOfficerDto);
		return electoralOfficerDto;
	}

	
}
