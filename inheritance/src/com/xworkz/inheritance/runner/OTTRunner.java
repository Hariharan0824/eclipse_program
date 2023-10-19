package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.OTT;

public class OTTRunner {
public static void main(String[] args) {
	OTT ott = new OTT();
	String ref=ott.toString();
	System.out.println(ref);
	
	OTT ott1 = new OTT(7,"Hari");
	String ref1=ott1.toString();
	System.out.println(ref1);
	
	OTT ott2= new OTT(8,"SIVA") ;
	boolean result1=ott1.equals(ott2);
	System.out.println(result1);
	
	OTT ott3= new OTT(9,"Santhosh") ;
	boolean result2=ott1.equals(ott3);
	System.out.println(result2);
	
	OTT ott4= new OTT(1,"Krishna") ;
	boolean result3=ott1.equals(ott3);
	System.out.println(result3);

}
}
