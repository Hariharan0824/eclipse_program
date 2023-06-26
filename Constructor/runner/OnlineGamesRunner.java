package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.OnlineGames;

public class OnlineGamesRunner {
	public static void main(String[] args) {
		
		OnlineGames games=new OnlineGames();
			
		OnlineGames games1=new OnlineGames("Hari");
		games.displayOnlineGames();
			
		OnlineGames games2=new OnlineGames("Hari","TeaShop");
		games2.displayOnlineGames();
			OnlineGames games3=new OnlineGames("Hari","TeaShop",600);
			games3.displayOnlineGames();
			
			String colour[]= {"Blue","Red","Yellow"};
			OnlineGames games4=new OnlineGames(colour) ;
			games4.displayOnlineGames();
			String location[]= {"Mico","BTM","HSR"};
			OnlineGames games5=new OnlineGames(colour,location) ;
			games5.displayOnlineGames();
			int price[]= {50,60,80};
			OnlineGames games6=new OnlineGames(colour,location,price);
			games6.displayOnlineGames();
			
			String shopName1= "Hari";
			String colour1[]= {"Blue","Red","Yellow"};
			OnlineGames games7=new OnlineGames(shopName1, colour1);
			games7.displayOnlineGames();
			
	        String shopName2= "Hari";
	        String typeOfShop= "TeaShop";
	        int customer= 600;
			String colour2[]= {"Blue","Red","Yellow"};
			OnlineGames games8=new OnlineGames(shopName2,typeOfShop,customer,colour2);
			games8.displayOnlineGames();

			String shopName4="Hari";
			String typeOfShop2= "TeaShop";
			int price1[]= {50,60,80};
			String location2[]= {"Mico","BTM","HSR"};
			String colour4[]= {"Blue","Red","Yellow"};
			int customer2= 600;
			OnlineGames games9=new OnlineGames(shopName4,typeOfShop2,price1,location2,colour4,customer2);
			games9.displayOnlineGames();
			if(games9!=null) {
				
				System.out.println("Not equal to null");
			}
		}
}
