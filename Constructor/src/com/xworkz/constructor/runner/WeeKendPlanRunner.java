package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.WeekendPlan;

public class WeeKendPlanRunner {
public static void main(String[] args) {
		
	WeekendPlan leaves=new WeekendPlan();
			
	WeekendPlan leaves1=new WeekendPlan("Hari");
	leaves1.displayWeekendPlan();
			
		WeekendPlan leaves2=new WeekendPlan("Hari","TeaShop");
		leaves2.displayWeekendPlan();
		WeekendPlan leaves3=new WeekendPlan("Hari","TeaShop",600);
		leaves3.displayWeekendPlan();
			
			String colour[]= {"Blue","Red","Yellow"};
			WeekendPlan leaves4=new WeekendPlan(colour) ;
			leaves4.displayWeekendPlan();
			String location[]= {"Mico","BTM","HSR"};
			WeekendPlan leaves5=new WeekendPlan(colour,location) ;
			leaves5.displayWeekendPlan();
			int price[]= {50,60,80};
			WeekendPlan leaves6=new WeekendPlan(colour,location,price);
			leaves6.displayWeekendPlan();
			
			String shopName1= "Hari";
			String colour1[]= {"Blue","Red","Yellow"};
			WeekendPlan leaves7=new WeekendPlan(shopName1, colour1);
			leaves7.displayWeekendPlan();
			
	        String shopName2= "Hari";
	        String typeOfShop= "TeaShop";
	        int customer= 600;
			String colour2[]= {"Blue","Red","Yellow"};
			WeekendPlan leaves8=new WeekendPlan(shopName2,typeOfShop,customer,colour2);
			leaves8.displayWeekendPlan();

			String shopName4="Hari";
			String typeOfShop2= "TeaShop";
			int price1[]= {50,60,80};
			String location2[]= {"Mico","BTM","HSR"};
			String colour4[]= {"Blue","Red","Yellow"};
			int customer2= 600;
			WeekendPlan leaves9=new WeekendPlan(shopName4,typeOfShop2,price1,location2,colour4,customer2);
			leaves9.displayWeekendPlan();
			if(leaves9!=null) {
				
				System.out.println("Not equal to null");
			}
		}
}
