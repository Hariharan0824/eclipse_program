package com.xwrokz.VegetableRunner;

import java.util.Collection;
import java.util.HashSet;

import javax.ejb.Remove;

public class MovieRunnerDTO {
	public static void main(String[] args) {
		Collection<MovieDTO> collection1=new HashSet<MovieDTO>();
		Collection<MovieDTO> collection2=new HashSet<MovieDTO>();
		
		MovieDTO dto=new MovieDTO(1, "Leo", "Lokesh", "Kumar", 10000000);
		MovieDTO dto1=new MovieDTO(2, "Master", "Kumar", "Lokesh", 10000);
		MovieDTO dto2=new MovieDTO(3, "villu", "Hari", "Kumar", 100895);
		MovieDTO dto3=new MovieDTO(4, "Beam", "Dinesh", "Kumar", 1004567);
		MovieDTO dto4=new MovieDTO(5, "Ayothi", "Lokesh", "hari", 1098743);
		MovieDTO dto5=new MovieDTO(6, "Aneethi", "siva", "Kumar", 100687);
		MovieDTO dto6=new MovieDTO(7, "thalapthi", "vasu", "Kumar", 1023456);
		MovieDTO dto7=new MovieDTO(8, "thuppaki", "Lokesh", "devan", 10000);
		MovieDTO dto8=new MovieDTO(9, "indian", "mulari", "Kumar", 100);
		MovieDTO dto9=new MovieDTO(10, "baasha", "muthu", "Kumar", 10876567);
		MovieDTO dto10=new MovieDTO(11, "anniyen", "Lokesh", "selvan", 102353);
		MovieDTO dto11=new MovieDTO(12, "ayen", "vasu", "Kumar", 234563456);
		MovieDTO dto12=new MovieDTO(13, "adhavan", "Lokesh", "saravan", 6323423);
		MovieDTO dto13=new MovieDTO(14, "anjan", "karthick", "Kumar", 34565673);
		MovieDTO dto14=new MovieDTO(15, "roja", "selvan", "brabhu", 8765223);
		MovieDTO dto15=new MovieDTO(16, "bombay", "Lokesh", "ram", 74656456);
		MovieDTO dto16=new MovieDTO(17, "sethu", "vettri", "Kumar", 234567543);
		MovieDTO dto17=new MovieDTO(17, "raam", "Lokesh", "valivelu", 34432345);
		MovieDTO dto18=new MovieDTO(18, "ramana", "vivek", "Kumar", 876543);
		MovieDTO dto19=new MovieDTO(19, "guna", "dhanush", "Kumar", 2345645);
		MovieDTO dto20=new MovieDTO(20, "kadhal", "surya", "Kumar", 100000000);
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
		
		collection1.forEach((M)->{
			if(M.getBudget()>=10000000) {
				System.out.println("The Movie budget is greater then 1 cr"+M.getBudget());
			}
			System.err.println("Remove from colllection2");
			collection2.remove(M);
			if(M.getBudget()<=10000000) {
				System.out.println("The Movie budget is less then 1 cr"+M.getBudget());
			}
		});
	}
	
	
}
