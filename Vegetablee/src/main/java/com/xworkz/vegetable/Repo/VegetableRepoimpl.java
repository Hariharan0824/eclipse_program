package com.xworkz.vegetable.Repo;

import java.util.Collection;
import java.util.HashSet;

import com.xwrokz.Vegetable.DTO.VegetableDTO;

public class VegetableRepoimpl implements VegetableRepo{
private  Collection<VegetableDTO> group= new HashSet<VegetableDTO>();
	@Override
	public void save(VegetableDTO dto) {
		System.err.println("Running Save in Repo");
		System.out.println("Running save in Repo");
		boolean saved = this.group.add(dto);
		if (saved) {
			System.out.println("Data saved");
		} else {
			System.out.println("Not saved");
		}
	}
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return this.group.size();
	}
	
	@Override
	public Collection<VegetableDTO> getAll() {
		// TODO Auto-generated method stub
		return this.group;
	}
}

