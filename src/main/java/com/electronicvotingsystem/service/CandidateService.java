package com.eletronicvotingsystem.service;

import java.util.List;

import com.eletronicvotingsystem.entity.Candidate;
import com.eletronicvotingsystem.exception.CandidateAlreadyExistsException;
import com.eletronicvotingsystem.exception.CandidateNotFoundException;
import com.eletronicvotingsystem.model.CandidateDTO;

public interface CandidateService {

	public String addCandidate(CandidateDTO candidateDTO) throws CandidateAlreadyExistsException;

	public CandidateDTO viewCandidate(int userId) throws CandidateNotFoundException;

	public List<Candidate> viewAllCandidates();

	public Candidate updateCandidate(CandidateDTO candidateDTO) throws CandidateNotFoundException;

	public String deleteCandidate(int userId) throws CandidateNotFoundException;

}
