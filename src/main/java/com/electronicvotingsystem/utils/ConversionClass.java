package com.electronicvotingsystem.utils;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.electronicvotingsystem.entity.Candidate;
import com.electronicvotingsystem.entity.Election;
import com.electronicvotingsystem.entity.ElectoralOfficer;
import com.electronicvotingsystem.entity.Schedule;
import com.electronicvotingsystem.model.CandidateDTO;
import com.electronicvotingsystem.model.ElectionDTO;
import com.electronicvotingsystem.model.ElectoralOfficerDTO;
import com.electronicvotingsystem.model.ScheduleDTO;

@Component
public class ConversionClass {

	// Converting Dto to entities to store in database collected from users;

	// ElectionDTO to Election entity to store
	public Election convertToElectionEntity(ElectionDTO electionDTO) {
		Election election = new Election();
		BeanUtils.copyProperties(electionDTO, election);
		List<CandidateDTO> candidateDTOs = electionDTO.getCandidateDTOs();
		List<Candidate> candidates = new ArrayList<>();

		for(CandidateDTO candidateDTO : candidateDTOs) {
			candidates.add(convertToCandidateEntity(candidateDTO));
		}
		election.setCandidates(candidates);

		return election;
	}

	// ElectoralOfficerDTO to ElectoralOfficer entity to store
	public ElectoralOfficer convertToElectoralOfficerEntity(ElectoralOfficerDTO electoralOfficerDTO) {
		ElectoralOfficer electoralOfficer = new ElectoralOfficer();
		BeanUtils.copyProperties(electoralOfficerDTO, electoralOfficer);

		return electoralOfficer;
	}
	

	//Converting  ScheduleDTO to entity to store 

	public Schedule convertToScheduleEntity(ScheduleDTO scheduleDTO) {
		Schedule schedule = new Schedule();
		BeanUtils.copyProperties(scheduleDTO, schedule);
		return schedule;
	}
	
	//Converting  CandidateDTO to entity to store

		public Candidate convertToCandidateEntity(CandidateDTO candidateDTO) {
			Candidate candidate = new Candidate();
			BeanUtils.copyProperties(candidateDTO, candidate);
			return candidate;
		}

	
	// Converting Entities to DTO objects to display to the users;

	// Election to ElectionDTO to display to users
	public ElectionDTO convertToElectionDTO(Election election) {
		ElectionDTO electionDto = new ElectionDTO();
		BeanUtils.copyProperties(election, electionDto);
		List<Candidate> candidates = election.getCandidates();
		List<CandidateDTO> candidatesDTOs = new ArrayList<>();
		for(Candidate candidate : candidates){
			candidatesDTOs.add(convertToCandidateDTO(candidate));
		}
		electionDto.setCandidateDTOs(candidatesDTOs);

		return electionDto;

	}

	// ElectoralOfficer to ElectoralOfficerDTO  to display to user
	public ElectoralOfficerDTO convertToElectoralOfficerDTO(ElectoralOfficer electoralOfficer) {
		ElectoralOfficerDTO electoralOfficerDto = new ElectoralOfficerDTO();
		BeanUtils.copyProperties(electoralOfficer, electoralOfficerDto);
		return electoralOfficerDto;
	}

	
	//Converting entity to ScheduleDTO to display to user

		public ScheduleDTO convertToScheduleDTO(Schedule schedule) {
			ScheduleDTO scheduleDto= new ScheduleDTO();
			BeanUtils.copyProperties(schedule, scheduleDto);
			return scheduleDto;
		}
		
		//Converting entity to CandidateDTO to display to user

		public CandidateDTO convertToCandidateDTO(Candidate candidate) {
			CandidateDTO candidateDto = new CandidateDTO();
			BeanUtils.copyProperties(candidate, candidateDto);
			return candidateDto;
		}
}
