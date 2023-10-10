package com.xworkz.Grocery.service;

import java.util.Collection;

import com.xworkz.GroceryDTO.GroceryDTO;

public interface GroceryService {

boolean validateAndSave(GroceryDTO dto);
	
	default int total(){
		return 0;
	}
	
	default Collection<GroceryDTO> getAll(){
		return null;
	}
}
