package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.RedBus;

public class RedBusRunner {
	public static void main(String args[]) {
		RedBus redbus=new RedBus();
		System.out.println("Name of the owner:"+redbus.owner);
		System.out.println("Number of buses associated with Redbus:"+redbus.buses);
		System.out.println("Bus Name:"+redbus.busName);
		System.out.println("Number of sitting seats:"+redbus.sittingSeats);
		System.out.println("Number of Sleeping Seats:"+redbus.sleeperSeats);
		System.out.println("Number of windows:"+redbus.windows);
		System.out.println("Departure location:"+redbus.departure);
		System.out.println("Destination location:"+redbus.destination);
		System.out.println("Time taken to complete journey:"+redbus.timeTaken);
		System.out.println("rating of the bus:"+redbus.rating);
		
	}
}
