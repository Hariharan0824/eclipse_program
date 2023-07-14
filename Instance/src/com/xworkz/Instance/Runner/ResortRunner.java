package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.MenuList;
import com.xworkz.Instance.things.Resort;

public class ResortRunner {
public static void main(String[] args) {
	Resort resort1 = new Resort();
	resort1.display();
	
	Resort resort2 = new Resort("Hari","Hotel",4,MenuList.Biriyani);
	resort2.display();
	Resort resort3 = new Resort();
	resort3.setvalue(MenuList.Puri);
	resort3.display();
}

}
