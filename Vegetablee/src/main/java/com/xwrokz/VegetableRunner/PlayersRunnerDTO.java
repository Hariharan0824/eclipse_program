package com.xwrokz.VegetableRunner;

import java.util.Collection;
import java.util.HashSet;

public class PlayersRunnerDTO {
	public static void main(String[] args) {
		Collection<PlayersDTO> collection1=new HashSet<PlayersDTO>();
		Collection<PlayersDTO> collection2=new HashSet<PlayersDTO>();

		PlayersDTO dto=new PlayersDTO(1, "Dhoni", "India", "Cricket", 40);
		PlayersDTO dto1=new PlayersDTO(2, "kohli", "India", "Cricket", 36);
		PlayersDTO dto2=new PlayersDTO(3, "raina", "India", "Cricket", 35);
		PlayersDTO dto3=new PlayersDTO(4, "yuvi", "India", "Cricket", 50);
		PlayersDTO dto4=new PlayersDTO(5, "dhawan", "India", "Cricket", 38);
		PlayersDTO dto5=new PlayersDTO(6, "jaddu", "India", "Cricket", 32);
		PlayersDTO dto6=new PlayersDTO(7, "ashwin", "India", "Cricket", 36);
		PlayersDTO dto7=new PlayersDTO(8, "rohit", "India", "Cricket", 41);
		PlayersDTO dto8=new PlayersDTO(9, "krishna", "India", "Cricket", 28);
		PlayersDTO dto9=new PlayersDTO(10, "pant", "India", "Cricket", 27);
		PlayersDTO dto10=new PlayersDTO(11, "karthick", "India", "Cricket", 43);
		PlayersDTO dto11=new PlayersDTO(12, "siraj", "India", "Cricket", 26);
		PlayersDTO dto12=new PlayersDTO(13, "sami", "India", "Cricket", 33);
		PlayersDTO dto13=new PlayersDTO(14, "raidu", "India", "Cricket", 39);
		PlayersDTO dto14=new PlayersDTO(15, "ruthuraj", "India", "Cricket", 29);
		PlayersDTO dto15=new PlayersDTO(16, "samson", "India", "Cricket", 35);
		PlayersDTO dto16=new PlayersDTO(17, "pandya", "India", "Cricket", 32);
		PlayersDTO dto17=new PlayersDTO(18, "rahul", "India", "Cricket", 30);
		PlayersDTO dto18=new PlayersDTO(19, "bumra", "India", "Cricket", 34);
		PlayersDTO dto19=new PlayersDTO(20, "venkatesh", "India", "Cricket", 30);

		System.out.println("Add to collection1");	
		
		collection1.add(dto);
		collection1.add(dto1);
		collection1.add(dto2);
		collection1.add(dto3);
		collection1.add(dto4);
		collection1.add(dto5);
		collection1.add(dto6);
		collection1.add(dto7);
		collection1.add(dto8);
		collection1.add(dto9);
		collection1.add(dto10);
		collection1.add(dto11);
		collection1.add(dto12);
		collection1.add(dto13);
		collection1.add(dto14);
		collection1.add(dto15);
		collection1.add(dto16);
		collection1.add(dto17);
		collection1.add(dto18);
		collection1.add(dto19);
		
		collection1.forEach((P)->{
			if(P.getAge()<30) {
				System.out.println("The Players age is Greater then : "+P.getAge());
			}else{
				System.out.println("The Players age is Less then : "+P.getAge());
			}
			System.err.println("Remove from colllection2");
			collection2.remove(P);
			if(P.getAge()>=40) {
				System.err.println("The Players age is above ro  : "+P.getAge());
			}
			else {
				System.err.println("Null value");
			}
			collection2.add(P);
		});
	}
	
	
        
}