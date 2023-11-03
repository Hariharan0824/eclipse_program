package com.xworkz.perfums.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.stereotype.Component;

import com.xworkz.perfums.dto.PerfumesDTO;
@Component
public class PerfumesRepoimpl implements PerfumesRepo {

	Collection<PerfumesDTO> obj=new ArrayList<PerfumesDTO>();
	
	@Override
	public void save(PerfumesDTO dto) {

		if(obj!=null) {
			
			obj.add(dto);	
		}
		System.out.println("Data Saved");
	}

	@Override
	public Collection<PerfumesDTO> read() {
		
		return obj;
	}

	@Override
	public Collection<PerfumesDTO> remove() {
		
		Iterator<PerfumesDTO> itr;
		
		return null;
	}

}
