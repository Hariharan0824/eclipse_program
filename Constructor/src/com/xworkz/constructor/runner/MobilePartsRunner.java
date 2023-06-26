package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.MobileParts;

public class MobilePartsRunner {
	public static void main(String[] args) {
		
		MobileParts parts=new MobileParts();
		
		MobileParts parts1=new MobileParts("Hari");
		parts1.displayMobileParts();
		
		MobileParts parts2=new MobileParts("Hari","TeaShop");
		parts2.displayMobileParts();
		MobileParts parts3=new MobileParts("Hari","TeaShop",600);
		parts3.displayMobileParts();
		
		String colour[]= {"Blue","Red","Yellow"};
		MobileParts parts4=new MobileParts(colour) ;
		parts4.displayMobileParts();
		String location[]= {"Mico","BTM","HSR"};
		MobileParts parts5=new MobileParts(colour,location) ;
		parts5.displayMobileParts();
		int price[]= {50,60,80};
		MobileParts parts6=new MobileParts(colour,location,price);
		parts6.displayMobileParts();
		
		String shopName1= "Hari";
		String colour1[]= {"Blue","Red","Yellow"};
		MobileParts parts7=new MobileParts(shopName1, colour1);
		parts7.displayMobileParts();
		
        String shopName2= "Hari";
        String typeOfShop= "TeaShop";
        int customer= 600;
		String colour2[]= {"Blue","Red","Yellow"};
		MobileParts parts8=new MobileParts(shopName2,typeOfShop,customer,colour2);
		parts8.displayMobileParts();

		String shopName4="Hari";
		String typeOfShop2= "TeaShop";
		int price1[]= {50,60,80};
		String location2[]= {"Mico","BTM","HSR"};
		String colour4[]= {"Blue","Red","Yellow"};
		int customer2= 600;
		MobileParts parts9=new MobileParts(shopName4,typeOfShop2,price1,location2,colour4,customer2);
		parts9.displayMobileParts();
		if(parts9!=null) {
			
			System.out.println("Not equal to null");
		}
	}

	}
	


