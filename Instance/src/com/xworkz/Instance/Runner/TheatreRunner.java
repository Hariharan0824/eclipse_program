package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Classes;
import com.xworkz.Instance.things.Theatre;

public class TheatreRunner {
public static void main(String[] args) {
	Theatre theatre = new Theatre();
	theatre.display();
	Theatre theatre1 = new Theatre("Maaveeran","Coimbatore");
	theatre1.display();
	Theatre theatre2 = new Theatre("Maaveeran","Coimbatore",1000,Classes.Firstclass);
	theatre2.display();
	Theatre theatre3 = new Theatre();
	theatre3.setvalue(Classes.SecondClass);
	theatre3.display();
}
}
