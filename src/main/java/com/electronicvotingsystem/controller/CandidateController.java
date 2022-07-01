package com.electronicvotingsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronicvotingsystem.entity.Candidate;
import com.electronicvotingsystem.exception.CandidateAlreadyExistsException;
import com.electronicvotingsystem.exception.CandidateNotFoundException;
import com.electronicvotingsystem.exception.UserAlreadyExistsException;
import com.electronicvotingsystem.model.CandidateDTO;
import com.electronicvotingsystem.service.CandidateService;

@RestController
public class CandidateController {

	@Autowired
	private CandidateService candidateService;

	@PostMapping(value = "/registercandidate")
	public String addCandidate(@RequestBody @Valid CandidateDTO candidateDTO) throws CandidateAlreadyExistsException, UserAlreadyExistsException
	{
		return candidateService.addCandidate(candidateDTO);
	}

	@GetMapping(value = "/viewcandidate/{id}")
	public CandidateDTO viewCandidate(@PathVariable("id") int id) throws CandidateNotFoundException{
		return candidateService.viewCandidate(id);
	}
	
	@GetMapping(value="/viewallcandidate")
	public List<Candidate> viewAllCandidates(){
		return candidateService.viewAllCandidates();
	}

}
