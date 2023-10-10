package com.xworkz.vegetable.services;

import java.util.Collection;


import com.xwrokz.Vegetable.DTO.VegetableDTO;

public interface VegetableService {

	boolean ValidAndSave(VegetableDTO dto);
	
	default int total() {
		return 0;
	}
	default Collection<VegetableDTO> getAll() {
		return null;
	}

	

}
