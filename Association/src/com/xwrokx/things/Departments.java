package com.xwrokx.things;

import java.sql.Date;

public class Departments {
 public String name;
 public Date data;
 public Employee employee;
 
 public Departments() {
	System.out.println("This is Department No Argument Constructor");
}
 public Departments(String name) {
	 this.name=name;
		System.out.println("This is Department Argument Constructor");
	}
 public Departments(Employee employee) {
	 this.employee=employee;
		System.out.println("This is Department Argument Constructor");
	}
}
