package com.xwrokz.Function;

public class Run {

	public static void main(String[] args) {
		Newspaper newspaper=(agency)->{
			if(agency.equals("TOI")) {
				return 8;
			}
			if(agency.equals("DC")) {
				return 5;
			}
			if(agency.equals("HI")) {
				return 3;
			}
			return 0;
			};
			call(newspaper,"TOI");
			
			IPhone iphone=()->{
				return true;
			};
			
			iphone.looksGood();
			
	
	Tyre tyre=(brand,size,type)->{
		if(brand.equals("MRF") && size==17 && type.equals("two")){
		return 1300;
	}
	if(brand.equals("CEAT") && size==14 && type.equals("two")){
	return 1700;
		
	}
	if(brand.equals("Hari") && size==17 && type.equals("two")){
		return 1900;
			
		}
	return 0;
	};
	
	check(tyre, "MRF", 17, "two");
	
}	
	static void call(Newspaper paper, String agency) {
		double val = paper.priceByAgency(agency);
		System.err.println("val is"+val);
	}
	static void check(Tyre tyre,String brand,int size,String type) {
		double price=tyre.getPrice(brand, size, type);
				System.err.println("price is"+ price);
	}

		
	}



