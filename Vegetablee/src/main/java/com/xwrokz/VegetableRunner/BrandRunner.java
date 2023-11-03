package com.xwrokz.VegetableRunner;

import java.util.Collection;
import java.util.HashSet;

public class BrandRunner {
	
	public static void main(String[] args) {
			BrandDTO dto1 = new BrandDTO("Nike","Phil Nike",30.7,"USA");
			BrandDTO dto2 = new BrandDTO("Titan","Tata",5.1,"India");
			BrandDTO dto3 = new BrandDTO("Apple","Tim Cook",800,"USA");
			BrandDTO dto4 = new BrandDTO("Tesla","Elon Musk",8.14,"USA");
			BrandDTO dto5 = new BrandDTO("Google","Sundar Pichai",280,"USA");
			BrandDTO dto6 = new BrandDTO("Allensoly","Sundar Pichai",280,"USA");
			BrandDTO dto7 = new BrandDTO("sony","Sundar Pichai",280,"USA");
			BrandDTO dto8 = new BrandDTO("vivo","Sundar Pichai",280,"USA");
			BrandDTO dto9 = new BrandDTO("MRF","Sundar Pichai",280,"USA");
			BrandDTO dto10 = new BrandDTO("Oneplus","Sundar Pichai",280,"USA");
			
			Collection<BrandDTO> collection=new HashSet<BrandDTO>();
			
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
			System.out.println("This is Brand running in collection");
			
			collection.stream().sorted().forEach((B)->System.out.println(B));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getRevenueInBillion()>20).forEach((B)->System.out.println(B.toString()));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getRevenueInBillion()<20).forEach((B)->System.out.println(B.toString()));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getCountry()=="USA").forEach((B)->System.out.println(B.toString()));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getCountry()!="USA").forEach((B)->System.out.println(B.toString()));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getName().startsWith("S")).forEach((B)->System.out.println(B.toString()));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getName().length()>5).forEach((B)->System.out.println(B.toString()));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getName().length()<5).forEach((B)->System.out.println(B.toString()));
			System.out.println("**************************");
			collection.stream().filter((B)->B.getName().length()==5).forEach((B)->System.out.println(B.toString()));
			
	}

}