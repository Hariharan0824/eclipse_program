package com.xworkz.templee.repo;

import java.util.Collection;

import com.xworkz.templee.dto.TempleeDTO;

public interface TempleeRepository {
	
	void save(TempleeDTO dto);
	
	default int total() {
		return 0;
	}

	default Collection<TempleeDTO> getAll() {
		return null;
	}

}
