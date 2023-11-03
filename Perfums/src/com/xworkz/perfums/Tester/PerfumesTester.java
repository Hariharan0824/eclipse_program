package com.xworkz.perfums.Tester;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.perfums.dto.PerfumesDTO;
import com.xworkz.perfums.service.PerfumesService;
import com.xworkz.perfums.service.PerfumesServicesimpl;

public class PerfumesTester {

	public static void main(String[] args) {
		
		PerfumesDTO dto = new PerfumesDTO("fogg",900,300,"flower","india");
		PerfumesDTO dto1 = new PerfumesDTO("wildstone",700,100,"wood","india");
		PerfumesDTO dto2 = new PerfumesDTO("denver",800,200,"flower","china");
		
		Collection<PerfumesDTO> obj=new HashSet<PerfumesDTO>();
		obj.add(dto);
		obj.add(dto1);
		obj.add(dto2);
		
		PerfumesService ref=new PerfumesServicesimpl();
		ref.validateAndSave(dto);
		ref.validateAndSave(dto1);
		ref.validateAndSave(dto2);
		Collection<PerfumesDTO> coll = ref.read();
		coll.stream().forEach(p -> System.out.println(p));
		
		System.out.println("-----------------------------------------------");
		ref.remove("fogg");
		Collection<PerfumesDTO> ref1 = ref.read();
		ref1.stream().forEach(p -> System.out.println(p));
				
	}

}
