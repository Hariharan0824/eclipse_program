package com.xwrokz.VegetableRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import java.util.List;

public class WarRunner {

	public static void main(String[] args) {
		
		
		
		PresidentDTO dto1=new PresidentDTO(1,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto2=new PresidentDTO(2,"Wor2dWar",24,LocalDate.of(12, 11,1988),LocalDate.of(11, 11,1989));
		PresidentDTO dto3=new PresidentDTO(3,"Word0War",25,LocalDate.of(13, 11,1989),LocalDate.of(11, 11,1988));
		Collection<PresidentDTO> collection1= new LinkedList<PresidentDTO>();
		collection1.add(dto1);
		collection1.add(dto2);
		collection1.add(dto3);
		
		CountryDTO dto4=new CountryDTO(1,"war1","asia",dto1);
		CountryDTO dto5=new CountryDTO(2,"war2","india",dto2);
		CountryDTO dto6=new CountryDTO(3,"war3","pas",dto3);
		Collection<CountryDTO> collection2= new LinkedList<CountryDTO>();
		collection2.add(dto4);
		collection2.add(dto5);
		collection2.add(dto6);
		
		WarDTO wardto1=new WarDTO(2,LocalDate.of(12, 13,1987),LocalDate.of(14, 9,1989),collection2,"asia");
		
		PresidentDTO dto7=new PresidentDTO(4,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto8=new PresidentDTO(5,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto9=new PresidentDTO(6,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		Collection<PresidentDTO> collection3= new LinkedList<PresidentDTO>();
		collection1.add(dto7);
		collection1.add(dto8);
		collection1.add(dto9);
		
		CountryDTO dto10=new CountryDTO(4,"war","asia",dto7);
		CountryDTO dto11=new CountryDTO(5,"war","asia",dto8);
		CountryDTO dto12=new CountryDTO(6,"war","asia",dto9);
		Collection<CountryDTO> collection4= new LinkedList<CountryDTO>();
		collection4.add(dto10);
		collection4.add(dto11);
		collection4.add(dto12);
		
		WarDTO wardto2=new WarDTO(3,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987),collection4,"india");
		
		PresidentDTO dto13=new PresidentDTO(7,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto14=new PresidentDTO(8,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto15=new PresidentDTO(9,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		Collection<PresidentDTO> collection5= new LinkedList<PresidentDTO>();
		collection1.add(dto13);
		collection1.add(dto14);
		collection1.add(dto15);
		
		CountryDTO dto16=new CountryDTO(7,"war","asia",dto7);
		CountryDTO dto17=new CountryDTO(8,"war","asia",dto8);
		CountryDTO dto18=new CountryDTO(9,"war","asia",dto9);
		Collection<CountryDTO> collection6= new LinkedList<CountryDTO>();
		collection4.add(dto16);
		collection4.add(dto17);
		collection4.add(dto18);
		
		WarDTO wardto3=new WarDTO(4,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987),collection4,"india");
		
		PresidentDTO dto19=new PresidentDTO(10,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto20=new PresidentDTO(11,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto21=new PresidentDTO(12,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		Collection<PresidentDTO> collection7= new LinkedList<PresidentDTO>();
		collection1.add(dto19);
		collection1.add(dto20);
		collection1.add(dto21);
		
		CountryDTO dto22=new CountryDTO(10,"war","asia",dto7);
		CountryDTO dto23=new CountryDTO(11,"war","asia",dto8);
		CountryDTO dto24=new CountryDTO(12,"war","asia",dto9);
		Collection<CountryDTO> collection8= new LinkedList<CountryDTO>();
		collection4.add(dto22);
		collection4.add(dto23);
		collection4.add(dto24);
		
		WarDTO wardto4=new WarDTO(5,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987),collection4,"india");
		
		PresidentDTO dto25=new PresidentDTO(13,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto26=new PresidentDTO(14,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		PresidentDTO dto27=new PresidentDTO(15,"WorldWar",23,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987));
		Collection<PresidentDTO> collection9= new LinkedList<PresidentDTO>();
		collection1.add(dto25);
		collection1.add(dto26);
		collection1.add(dto27);
		
		CountryDTO dto28=new CountryDTO(13,"war","asia",dto7);
		CountryDTO dto29=new CountryDTO(14,"war","asia",dto8);
		CountryDTO dto30=new CountryDTO(15,"war","asia",dto9);
		Collection<CountryDTO> collection10= new LinkedList<CountryDTO>();
		collection4.add(dto28);
		collection4.add(dto29);
		collection4.add(dto30);
		WarDTO wardto5=new WarDTO(5,LocalDate.of(11, 11,1987),LocalDate.of(11, 11,1987),collection4,"india");
		
		Collection<WarDTO> wars=new HashSet<WarDTO>();
		wars.add(wardto1);
		wars.add(wardto2);
		wars.add(wardto3);
		wars.add(wardto4);
		wars.add(wardto5);
		
	
		
		//find president by country names
				System.out.println("====================");
				System.out.println("<<<----Finding president by country names---->>>");
				//find president by country names
				System.out.println("====================");
				System.out.println("<<<----Finding president by country names---->>>");
				List<PresidentDTO> prez1 = wars.stream()
						.flatMap(c -> c.getParticipants().stream()
								.filter(p -> p.getCountryName().equals("India")).map(p -> p.getPresident())).collect(Collectors.toList());
				prez1.forEach(p -> System.out.println(p));
		
	
	}
}