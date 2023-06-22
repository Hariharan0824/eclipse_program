package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Cake;

public class CakeRunner {

	public static void main(String args[]) {
		Cake cake = new Cake();
		cake.flavour="BlackForest";
		cake.price=450;
		cake.weight=1.2f;
		cake.shap="Round";
		cake.types="Tasty";
		System.out.println("This is Cake Shop");
		System.out.println("This is Cakes Varaity:"+cake.flavour);
		System.out.println("This is price Varaity:"+cake.price);
		System.out.println("This is weight Varaity:"+cake.weight);
		System.out.println("This is  Varaity:"+cake.shap);
		System.out.println("This is types Varaity:"+cake.types);
	}
	
}
