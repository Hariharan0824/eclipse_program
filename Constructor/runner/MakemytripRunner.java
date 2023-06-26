package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Makemytrip;

public class MakemytripRunner {
public static void main(String args[]) {
	
	Makemytrip trip=new Makemytrip();
	trip.setApplicationName("Hari");
	trip.setTiming("Mrng");
	trip.setDate("Yesterday");
	trip.setLunchType("Veg");
	trip.setAddress("Mico");
	trip.setFamousPlace("BTM");
	trip.setNumberOfPerson(800);
	trip.setNumberOfPlace(809);
	trip.setPackages(345);
	trip.setKilometer(675);
	System.out.println(trip.getApplicationName());
	System.out.println(trip.getTiming());
	System.out.println(trip.getDate());
	System.out.println(trip.getLunchType());
	System.out.println(trip.getAddress());
	System.out.println(trip.getFamousPlace());
	System.out.println(trip.getNumberOfPerson());
	System.out.println(trip.getNumberOfPlace());
	System.out.println(trip.getPackages());
	System.out.println(trip.getKilometer());
	
}
}
