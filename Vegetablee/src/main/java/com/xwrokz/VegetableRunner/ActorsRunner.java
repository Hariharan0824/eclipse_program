package com.xwrokz.VegetableRunner;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ActorsRunner {
	public static void main(String[] args) {
	
		ActorsDTO dto1=new ActorsDTO(1, "surya", 2, "male", "india");
		ActorsDTO dto2=new ActorsDTO(2, "Ranveersign", 2, "male", "USA");
		ActorsDTO dto3=new ActorsDTO(3, "Vijay", 2, "male", "AUS");
		ActorsDTO dto4=new ActorsDTO(4, "Ajith", 2, "male", "Srilanka");
		ActorsDTO dto5=new ActorsDTO(5, "surya", 2, "male", "india");
		ActorsDTO dto6=new ActorsDTO(6, "arya", 2, "male", "pak");
		ActorsDTO dto7=new ActorsDTO(7, "vishal", 2, "male", "eruop");
		ActorsDTO dto8=new ActorsDTO(8, "vikranth", 2, "male", "SA");
		ActorsDTO dto9=new ActorsDTO(9, "kayal", 2, "female", "SA");
		ActorsDTO dto10=new ActorsDTO(10, "nine", 2, "female", "westbangal");
		
		Collection<ActorsDTO> collection=new HashSet<ActorsDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		
		List<String>actors=collection.stream().sorted().map(ref->ref.getName()).collect(Collectors.toList());
		actors.forEach(e -> System.out.println(e));
		System.out.println("1*******************");
	    System.out.println("Only country names in mapping");
		
		List<String>actors2=collection.stream().sorted((a1,a2) -> a2.getCountry().compareTo(a1.getCountry()))
				.map(ref->{ return ref.getCountry().toUpperCase();}).collect(Collectors.toList());
		actors2.forEach(e -> System.out.println(e));
		System.out.println("2*******************");
		 System.out.println("Only ID in mapping");
		 collection.stream().map(ref->ref.getId()).sorted().collect(Collectors.toList()).forEach((c)->System.out.println(c));
		 System.out.println("3*******************");
		 System.out.println("All actors in acsending order");
		 collection.stream().sorted((e1,e2)->e1.getLangKnown().compareTo(e2.getLangKnown()))
			.forEach((c)->System.out.println(c));
		 System.out.println("4*******************");
		 System.out.println("All actors in descending order by language known");
			collection.stream().sorted((e1,e2)->e2.getLangKnown().compareTo(e1.getLangKnown()))
			.forEach((c)->System.out.println(c));
			System.out.println("5*******************");
			System.out.println("Printing  male actors ");
			collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
			.filter((e) -> e.getGender() == "Male").forEach((e) -> System.out.println(e.toString()));
			System.out.println("6*******************");
			System.out.println("Printing  Female actors in descending order by name");
			collection.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName()))
			.filter((e) -> e.getGender() == "Female").forEach((e) -> System.out.println(e.toString()));
			System.out.println("7*******************");
			System.out.println("Printing actors having ID more than 5 ");
			collection.stream().sorted((a1,a2)->a1.getId().compareTo(a2.getId()))
			.filter((e) -> e.getId() > 5).collect(Collectors.toList()).forEach((e) -> System.out.println(e.toString()));
			System.out.println("8*******************");
			System.out.println("Printing all country by its count ");
			Long count = collection.stream().filter(c -> c.getCountry().equals("SA")).count();
			System.out.println("Count:"+count);
	}

}