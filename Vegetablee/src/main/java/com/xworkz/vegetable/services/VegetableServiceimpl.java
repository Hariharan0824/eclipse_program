package com.xworkz.vegetable.services;

import java.util.Collection;


import com.xworkz.vegetable.Repo.VegetableRepo;
import com.xwrokz.Vegetable.DTO.VegetableDTO;

public class VegetableServiceimpl implements VegetableService{
	
	private VegetableRepo repo;
	
	public VegetableServiceimpl(VegetableRepo repo) {
		this.repo=repo;
	}

	@Override
	public boolean ValidAndSave(VegetableDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		repo.save(dto);
		return true;
	}
	public int total() {
		return this.repo.total();
	}
	public Collection<VegetableDTO> getAll() {
		return this.repo.getAll();
	}

	
}
