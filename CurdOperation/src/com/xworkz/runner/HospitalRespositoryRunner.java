package com.xworkz.runner;

import com.xworkz.interfaces.HospitalRespositoryInterface;
import com.xworkz.things.HospitalRespositoryImpl;

public class HospitalRespositoryRunner {
	
	
	public static void main(String[] args) {
		HospitalRespositoryInterface hosp = new HospitalRespositoryImpl();
		hosp.visited("Apollo Hospital");
		hosp.visited("Manipal Hospital");
		hosp.visited("Fortis Hospital");
		hosp.visited("Narayana Health");
		hosp.visited("Columbia Asia Hospital");
		hosp.visited("KIDVAI Hospital");
		
		hosp.display();

	}

}
