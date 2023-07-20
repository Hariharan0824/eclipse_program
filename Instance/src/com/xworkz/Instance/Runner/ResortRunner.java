package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.MenuList;
import com.xworkz.Instance.things.Resort;

public class ResortRunner {
public static void main(String[] args) {
	Resort resort2 = new Resort("Hotel",4);

	resort2.setvalue(MenuList.Puri);
	resort2.display();
}

}
