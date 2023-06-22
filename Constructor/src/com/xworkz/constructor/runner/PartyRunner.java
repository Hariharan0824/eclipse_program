package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Party;

public class PartyRunner {
public static void main(String args[]) {
	
	Party celibration=new Party();
	celibration.setName("Hari");
	celibration.setTiming("Evening");
	celibration.setDate("Today");
	celibration.setLunchType("Veg");
	celibration.setCelibrityName("Hari");
	celibration.setAddress("Mico");
	celibration.setNumberOfPerson(700);
	celibration.setVewing(1699);
	celibration.setPrice(9000);
	celibration.setKilometer(500);
	System.out.println(celibration.getName());
	System.out.println(celibration.getTiming());
	System.out.println(celibration.getDate());
	System.out.println(celibration.getLunchType());
	System.out.println(celibration.getCelibrityName());
	System.out.println(celibration.getAddress());
	System.out.println(celibration.getNumberOfPerson());
	System.out.println(celibration.getVewing());
	System.out.println(celibration.getName());
	System.out.println(celibration.getKilometer());
}
}
