package com.xworkz.runner;


import com.xworkz.interfaces.ArmyRespositoryInterface;

import com.xworkz.things.ArmyRespositoryImpl;

public class ApartmentRespositoryRunner {
	
	public static void main(String[] args) {
		ArmyRespositoryInterface hosp = new ArmyRespositoryImpl();
		hosp.visited("Apollo Hospital");
		hosp.visited("Manipal Hospital");
		hosp.visited("Fortis Hospital");
		hosp.visited("Narayana Health");
		hosp.visited("Columbia Asia Hospital");
		hosp.visited("KIDVAI Hospital");
		
		hosp.display();

	}

}
