package com.xworkz.runner;

import com.xwrokx.things.Departments;
import com.xwrokx.things.Employee;
import com.xwrokx.things.Investor;
import com.xwrokx.things.Isro;
import com.xwrokx.things.Lab;
import com.xwrokx.things.Machines;

public class IsroRunner {
	public static void main(String[] args) {
		Isro isro = new Isro(new Departments(new Employee(new Investor(new Lab(new Machines())))));
		
	}

}
