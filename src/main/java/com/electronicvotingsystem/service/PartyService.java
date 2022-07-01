package com.example.electronicvotingsystem.service;

import java.util.List;

import com.example.electronicvotingsystem.entity.Party;
import com.example.electronicvotingsystem.exception.PartyAlreadyExistsException;
import com.example.electronicvotingsystem.exception.PartyNotFoundException;
import com.example.electronicvotingsystem.model.PartyDTO;

public interface PartyService
{
  Party saveParty(Party party);
  
List<Party> getAllParty()throws PartyAlreadyExistsException;

//addParty
	public Party addParty(PartyDTO partyDTO) throws PartyAlreadyExistsException;

	//viewParty
	public PartyDTO viewParty(int partyId)throws PartyNotFoundException;

	//UpdateParty
	public Party updateParty( PartyDTO partyDTO)throws PartyNotFoundException;

	//deleteParty
	public String deleteParty(int partyId)throws PartyNotFoundException;
	
	//viewAllParty
	public List<Party> viewAllParty();

	
	
}
