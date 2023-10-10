package com.xworkz.repo;

import java.util.Collection;

import com.xworkz.GroceryDTO.GroceryDTO;

public interface GroceryRepo {
	void save(GroceryDTO dto);

	default int total() {
		return 0;
	}

	default Collection<GroceryDTO> getAll() {
		return null;
	}

}
