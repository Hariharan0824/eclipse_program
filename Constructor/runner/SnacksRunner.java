package com.xworkz.constructor.runner;


import com.xworkz.constructor.things.Snacks;

public class SnacksRunner {
public static void main(String[] args) {
		
	Snacks breakTime=new Snacks();
		
	Snacks breakTime2=new Snacks("Hari");
	breakTime2.displaySnacks();
		
		Snacks breakTime3=new Snacks("Hari","TeaShop");
		breakTime3.displaySnacks();
		Snacks breakTime4=new Snacks("Hari","TeaShop",600);
		breakTime4.displaySnacks();
		
		String colour[]= {"Blue","Red","Yellow"};
		Snacks breakTime5=new Snacks(colour) ;
		breakTime5.displaySnacks();
		String location[]= {"Mico","BTM","HSR"};
		Snacks breakTime6=new Snacks(colour,location) ;
		breakTime6.displaySnacks();
		int price[]= {50,60,80};
		Snacks breakTime7=new Snacks(colour,location,price);
		breakTime7.displaySnacks();
		
		String shopName1= "Hari";
		String colour1[]= {"Blue","Red","Yellow"};
		Snacks breakTime8=new Snacks(shopName1, colour1);
		breakTime8.displaySnacks();
		
        String shopName2= "Hari";
        String typeOfShop= "TeaShop";
        int customer= 600;
		String colour2[]= {"Blue","Red","Yellow"};
		Snacks breakTime9=new Snacks(shopName2,typeOfShop,customer,colour2);
		breakTime9.displaySnacks();

		String shopName4="Hari";
		String typeOfShop2= "TeaShop";
		int price1[]= {50,60,80};
		String location2[]= {"Mico","BTM","HSR"};
		String colour4[]= {"Blue","Red","Yellow"};
		int customer2= 600;
		Snacks breakTime10=new Snacks(shopName4,typeOfShop2,price1,location2,colour4,customer2);
		breakTime10.displaySnacks();
		if(breakTime10!=null) {
			
			System.out.println("Not equal to null");
		}
	}
}
