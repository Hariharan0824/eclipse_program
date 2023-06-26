package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.TeaShop;

public class TeaShopRunner {
	
	public static void main(String args[]) {
		TeaShop partyShop=new TeaShop();
		
		TeaShop partyShop1=new TeaShop("Hari");
		partyShop1.displayTeaShop();
		
		TeaShop partyShop2=new TeaShop("Hari","TeaShop");
		partyShop2.displayTeaShop();
		TeaShop partyShop3=new TeaShop("Hari","TeaShop",600);
		partyShop3.displayTeaShop();
		
		String colour[]= {"Blue","Red","Yellow"};
		TeaShop partyShop4=new TeaShop(colour) ;
		partyShop4.displayTeaShop();
		String location[]= {"Mico","BTM","HSR"};
		TeaShop partyShop5=new TeaShop(colour,location) ;
		partyShop5.displayTeaShop();
		int price[]= {50,60,80};
		TeaShop partyShop6=new TeaShop(colour,location,price);
		partyShop6.displayTeaShop();
		
		String shopName1= "Hari";
		String colour1[]= {"Blue","Red","Yellow"};
		TeaShop partyShop7=new TeaShop(shopName1, colour1);
		partyShop7.displayTeaShop();
		
        String shopName2= "Hari";
        String typeOfShop= "TeaShop";
        int customer= 600;
		String colour2[]= {"Blue","Red","Yellow"};
		TeaShop partyShop8=new TeaShop(shopName2,typeOfShop,customer,colour2);
		partyShop8.displayTeaShop();

		String shopName4="Hari";
		String typeOfShop2= "TeaShop";
		int price1[]= {50,60,80};
		String location2[]= {"Mico","BTM","HSR"};
		String colour4[]= {"Blue","Red","Yellow"};
		int customer2= 600;
		TeaShop partyShop9=new TeaShop(shopName4,typeOfShop2,price1,location2,colour4,customer2);
		partyShop9.displayTeaShop();
		if(partyShop9!=null) {
			
			System.out.println("Not equal to null");
		}
	}

}
