package com.xworkz.templee.repo;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.templee.dto.TempleeDTO;

public class TempleeRepositoryImpl implements TempleeRepository{
	private Collection<TempleeDTO> group = new LinkedList<TempleeDTO>();

	@Override
	public void save(TempleeDTO dto) {
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
		public Collection<TempleeDTO> getAll() {
			// TODO Auto-generated method stub
			return this.group;
		}
	}


