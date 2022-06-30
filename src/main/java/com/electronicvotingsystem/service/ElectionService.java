package com.electronicvotingsystem.service;

import java.util.List;

import com.electronicvotingsystem.entity.Election;
import com.electronicvotingsystem.exception.ElectionNotFoundException;
import com.electronicvotingsystem.model.ElectionDTO;

public interface ElectionService {

	
public Election addElection(ElectionDTO electionDto);

public List<Election>viewAllElection()throws ElectionNotFoundException;

public ElectionDTO viewElection(int electionId)throws ElectionNotFoundException;

public Election updateElection(ElectionDTO electionDTO)throws ElectionNotFoundException;

public String deleteElection(int id) throws ElectionNotFoundException;
}
