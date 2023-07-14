package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Festival;
import com.xworkz.Instance.things.Pongal;
import com.xworkz.Instance.things.VinayagarBirthday;

public class FestivalRunner extends VinayagarBirthday{

	public static void main(String[] args) {
		FestivalRunner fr =new FestivalRunner();
		fr.noOfFamousFestival=5;
		Festival fest1 =  new Festival();
		
		Festival festival=new Pongal("abc",3,2,"xyz");
		festival.display();
	}
}
