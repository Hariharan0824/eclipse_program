package com.xworkz.repo;

import java.util.Collection;

import com.xworkz.TempleDTO;

public interface TempleDTO {
	void save(TempleDTO dto);

	default int total() {
		return 0;
	}

	default Collection<TempleDTO> getAll() {
		return null;
	}

}
