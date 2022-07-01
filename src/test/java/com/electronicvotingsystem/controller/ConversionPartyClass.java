package com.example.electronicvotingsystem.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.electronicvotingsystem.entity.Party;
import com.example.electronicvotingsystem.model.PartyDTO;
@Component
public class ConversionClass
{
	//converting PartyDTO to entity

		public Party convertToPartyEntity(PartyDTO partyDTO)
		{
			Party party = new Party();
			if(partyDTO!=null){
			BeanUtils.copyProperties(partyDTO, party);
			}
			return party;
		}

		//converting entity to PartyDTO

		public PartyDTO convertToPartyDTO(Party party) {
			PartyDTO partyDto = new PartyDTO();
			if(party!=null){
			BeanUtils.copyProperties(party,partyDto);
			}
			return partyDto;
		}
}
