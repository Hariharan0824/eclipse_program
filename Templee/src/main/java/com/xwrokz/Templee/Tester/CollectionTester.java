package com.xwrokz.Templee.Tester;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


import com.xworkz.templee.dto.TempleeDTO;

public class CollectionTester {
	public static void main(String[] args) {
		
		TempleeDTO dto = new TempleeDTO();
		TempleeDTO dto1 = new TempleeDTO();
		TempleeDTO dto2 = new TempleeDTO();
		TempleeDTO dto3 = new TempleeDTO();
		TempleeDTO dto4 = new TempleeDTO();
		
		Collection<TempleeDTO> collection = new HashSet<TempleeDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		
		System.err.println("Total Temple "+collection.size());
		for (TempleeDTO ref : collection) {
			System.out.println(ref.getName());
		}
		System.out.println("Iterator");
Iterator<TempleeDTO> iterator=collection.iterator();
		while (iterator.hasNext()) {
		TempleeDTO ele = iterator.next();
		System.err.println(ele.getName());
		if(ele.getName().equals("Krishna")) {
			iterator.remove();
		}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
