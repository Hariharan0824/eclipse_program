package com.xworkz.Grocery.service;

import java.util.Collection;

import com.xworkz.GroceryDTO.GroceryDTO;
import com.xworkz.repo.GroceryRepo;

public class GroceryServiceimpl implements GroceryService{
private GroceryRepo repo;
	
	public  GroceryServiceimpl(GroceryRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(GroceryDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		repo.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public Collection<GroceryDTO> getAll() {
		return this.repo.getAll();
	}

}
