package com.xworkz.templee.service;

import java.util.Collection;

import com.xworkz.templee.dto.TempleeDTO;
import com.xworkz.templee.repo.TempleeRepository;

public class TempleeServiceImpl implements TempleeService {
	private TempleeRepository repo;
	
	public TempleeServiceImpl(TempleeRepository repo) {
		this.repo=repo;
	}

	@Override
	public boolean validAndSave(TempleeDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		repo.save(dto);
		return true;
		
		
	}
	
	public int total() {
		return this.repo.total();
	}

	
	public Collection<TempleeDTO> getAll() {
		return this.repo.getAll();
	}

}
