package com.xworkz.perfums.service;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfums.dto.PerfumesDTO;
import com.xworkz.perfums.repo.PerfumesRepo;
import com.xworkz.perfums.repo.PerfumesRepoimpl;

@Component
public class PerfumesServicesimpl implements PerfumesService{
	@Autowired
	private PerfumesRepo repo;

	@Override
	public boolean validateAndSave(PerfumesDTO dto) {
		if(dto!=null) {
			if(dto.getBrandName()!=null && dto.getBrandName().length()>3) {
				if(dto.getPrice()>500) {
					if(dto.getPerfumeNote()!=null) {
						System.out.println("Data is validated...");
						repo.save(dto);
						return true;
					}
				}
			}
		}
		
		return false;
	}

	@Override
	public Collection<PerfumesDTO> read() {
		
		
		return repo.read();
	}

	@Override
	public Collection<PerfumesDTO> remove(String brandNanme) {
		Collection<PerfumesDTO> p = repo.read();
		Iterator<PerfumesDTO> itr = p.iterator();
		
		while(itr.hasNext()) {
			PerfumesDTO dto=itr.next();
			if(dto.getBrandName().equals(brandNanme)) {
				
				itr.remove();
			}
		}
		return null;
	}
	

}
