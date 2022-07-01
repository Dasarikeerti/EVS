package com.eletronicvotingsystem.service;

import java.util.List;

import com.eletronicvotingsystem.entity.Candidate;
import com.eletronicvotingsystem.entity.Election;
import com.eletronicvotingsystem.entity.Party;
import com.eletronicvotingsystem.entity.VoterRequest;
import com.eletronicvotingsystem.exception.CandidateAlreadyExistsException;
import com.eletronicvotingsystem.exception.CandidateNotFoundException;
import com.eletronicvotingsystem.exception.ElectionAlreadyExistsException;
import com.eletronicvotingsystem.exception.ElectionNotFoundException;
import com.eletronicvotingsystem.exception.PartyAlreadyExistsException;
import com.eletronicvotingsystem.exception.PartyNotFoundException;
import com.eletronicvotingsystem.exception.UserAlreadyExistsException;
import com.eletronicvotingsystem.exception.VoterRequestNotFoundException;
import com.eletronicvotingsystem.model.AdminDTO;
import com.eletronicvotingsystem.model.CandidateDTO;
import com.eletronicvotingsystem.model.ElectionDTO;
import com.eletronicvotingsystem.model.PartyDTO;
import com.eletronicvotingsystem.model.VoterRequestDTO;

public interface AdminServices {
	
	public String registerAdmin(AdminDTO adminDTO)throws UserAlreadyExistsException;
	
	public Election addElection(ElectionDTO electionDto)throws ElectionAlreadyExistsException;

	public List<Election>viewAllElection()throws ElectionNotFoundException;

	public ElectionDTO viewElection(int electionId)throws ElectionNotFoundException;
	

	//addParty
	public Party addParty(PartyDTO partyDTO) throws PartyAlreadyExistsException;

	//viewAllParty
	public List<Party> viewAllParty();
	
	public PartyDTO viewParty(String partyName) throws PartyNotFoundException;

	public Candidate addCandidate(CandidateDTO candidateDTO) throws CandidateAlreadyExistsException;

	public CandidateDTO viewCandidate(String userName) throws CandidateNotFoundException;

	public List<Candidate> viewAllCandidates();

	public List<VoterRequest> viewAllVoterRequest();

	//viewVoterRequest
	public VoterRequestDTO viewVoterRequest(int requestId) throws VoterRequestNotFoundException;


}
