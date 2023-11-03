package com.xworkz.perfums.service;

import java.util.Collection;

import com.xworkz.perfums.dto.PerfumesDTO;

public interface PerfumesService {

	public boolean validateAndSave(PerfumesDTO dto);
	
	public Collection<PerfumesDTO> read();
	
	public Collection<PerfumesDTO> remove(String brandName);
}
