package com.xworkz.constructor.runner;
import com.xworkz.constructor.things.Medical;
public class MedicalRunner {
	public static void main(String args[]) {
		Medical hospital=new Medical();
		
		Medical hospital10=new Medical("Hari");
		hospital10.displayTeaShop();
		
		Medical hospital2=new Medical("Hari","TeaShop");
		hospital.displayTeaShop();
		Medical hospital3=new Medical("Hari","TeaShop",600);
		hospital3.displayTeaShop();
		
		String colour[]= {"Blue","Red","Yellow"};
		Medical hospital4=new Medical(colour) ;
		hospital4.displayTeaShop();
		String location[]= {"Mico","BTM","HSR"};
		Medical hospital5=new Medical(colour,location) ;
		hospital5.displayTeaShop();
		int price[]= {50,60,80};
		Medical hospital6=new Medical(colour,location,price);
		hospital6.displayTeaShop();
		
		String shopName1= "Hari";
		String colour1[]= {"Blue","Red","Yellow"};
		Medical hospital7=new Medical(shopName1, colour1);
		hospital7.displayTeaShop();
		
        String shopName2= "Hari";
        String typeOfShop= "TeaShop";
        int customer= 600;
		String colour2[]= {"Blue","Red","Yellow"};
		Medical hospital8=new Medical(shopName2,typeOfShop,customer,colour2);
		hospital8.displayTeaShop();

		String shopName4="Hari";
		String typeOfShop2= "TeaShop";
		int price1[]= {50,60,80};
		String location2[]= {"Mico","BTM","HSR"};
		String colour4[]= {"Blue","Red","Yellow"};
		int customer2= 600;
		Medical hospital9=new Medical(shopName4,typeOfShop2,price1,location2,colour4,customer2);
		hospital9.displayTeaShop();
		if(hospital9!=null) {
			
			System.out.println("Not equal to null");
		}
	}

}
