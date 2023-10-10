package com.xworkz.vegetable.Repo;

import java.util.Collection;

import com.xwrokz.Vegetable.DTO.VegetableDTO;

public interface VegetableRepo {

	void save(VegetableDTO dto);
	
	default int total() {
		return 0;
	}

	default Collection<VegetableDTO> getAll(){
		return null;	
	}
}
