package com.xwrokz.VegetableRunner;

import java.util.Collection;
import java.util.HashSet;

import com.xwrokz.Vegetable.DTO.VegetableDTO;

public class VegetablesDTO {
	public static void main(String[] args) {
		Collection<VegetableDTO> collection1=new HashSet<VegetableDTO>();
		Collection<VegetableDTO> collection2=new HashSet<VegetableDTO>();

		VegetableDTO dto= new VegetableDTO(1,"carrot",40,1);
		VegetableDTO dto1= new VegetableDTO(2,"beans",180,3);
		VegetableDTO dto2= new VegetableDTO(3,"potato",20,3);
		VegetableDTO dto3= new VegetableDTO(4,"onion",10,4);
		System.out.println("add to collection1");

		collection1.add(dto);
		collection1.add(dto1);
		collection1.add(dto2);
		collection1.add(dto3);

		collection1.forEach((v)->{
			if(v.getPrice()>=100) {
				System.out.println("Price is too high"+v.getPrice());	
			}else {
				System.out.println("Price is Ok"+v.getPrice());	
				collection2.add(v);
			}




		});

	}
}

	