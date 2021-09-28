package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub {
	
	public SpecimenDTO fetchBy (int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("40.75");
		specimenDTO.setLongitude("-70.60");
		specimenDTO.setDescription("An Eastern Redbud");
		return specimenDTO;
	}

	public void save(SpecimenDTO specimenDTO) {
		
	}
}
