package com.xwrokz.repoimpl;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.GroceryDTO.GroceryDTO;

public interface GroceryReopimpl {
	private Collection<GroceryDTO> group = new LinkedList<GroceryDTO>();

	@Override
	public void save(GroceryDTO dto) {
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
		return this.group.size();
	}

	@Override
	public Collection<GroceryDTO> getAll() {
		return this.group;
	}
	

}
