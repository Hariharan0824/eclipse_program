package com.xworkz.templee.service;

import java.util.Collection;

import com.xworkz.templee.dto.TempleeDTO;

public interface TempleeService {
	boolean validAndSave(TempleeDTO dto);
	
	default int total() {
		return 0;
	}

	default Collection<TempleeDTO> getAll() {
		return null;
	}

}
