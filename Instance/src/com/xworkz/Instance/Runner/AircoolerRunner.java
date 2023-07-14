package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Aircooler;

public class AircoolerRunner {
public static void main(String[] args) {
	Aircooler cooler=new Aircooler();
	cooler.wheatherCondition();
	cooler.setCondition(9);
	String getcondition=cooler.getcondition(cooler.getCondition());
System.out.println(getcondition);
String getCondition=cooler.getCondition(getcondition);
System.out.println(getCondition);
}
}