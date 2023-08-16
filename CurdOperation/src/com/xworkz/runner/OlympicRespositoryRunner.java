package com.xworkz.runner;

import com.xworkz.interfaces.OlympicRespositoryInterface;
import com.xworkz.things.OlympicRespositoryImpl;

public class OlympicRespositoryRunner {
	public static void main(String[] args) {
		OlympicRespositoryInterface hosp = new OlympicRespositoryImpl();
		hosp.visited("Apollo Hospital");
		hosp.visited("Manipal Hospital");
		hosp.visited("Fortis Hospital");
		hosp.visited("Narayana Health");
		hosp.visited("Columbia Asia Hospital");
		hosp.visited("KIDVAI Hospital");
		
		hosp.display();

	}

}
