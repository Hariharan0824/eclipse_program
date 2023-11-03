package com.xworkz.perfums.repo;

import java.util.Collection;

import com.xworkz.perfums.dto.PerfumesDTO;

public interface PerfumesRepo {
	public void save(PerfumesDTO dto);
	
	public Collection<PerfumesDTO> read();
	public Collection<PerfumesDTO> remove();
}
