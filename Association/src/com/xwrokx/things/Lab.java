package com.xwrokx.things;

import java.sql.Date;

public class Lab {
	public String name;
	public Date data;
    public Machines machines;
    
    public Lab() {
		System.out.println("This is Lab no Argument contructors");
	}
    public Lab(String name) {
    	this.name=name;
		System.out.println("This is Lab no Argument contructors");
	}
    public Lab(Machines machines) {
    	this.machines=machines;
		System.out.println("This is Lab contructors");
	}

}
