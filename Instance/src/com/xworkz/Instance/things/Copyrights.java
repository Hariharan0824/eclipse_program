package com.xworkz.Instance.things;

public class Copyrights extends AI{
	protected String name;
	protected int noOfPatents;
	protected int importenPatents;
	protected String typesName;
	
	public Copyrights() {
		System.out.println("This is Patents Constructor");
	}

	public Copyrights(String name, int noOfPatents, int importenPatents, String typesName) {
		super();
		this.name = name;
		this.noOfPatents = noOfPatents;
		this.importenPatents = importenPatents;
		this.typesName = typesName;
		System.out.println("name:"+this.name);
		System.out.println("noOfPatents:"+this.noOfPatents);
		System.out.println("importenPatents:"+this.importenPatents);
		System.out.println("typesName:"+this.typesName);
	}
	public void display() {
		System.out.println("This is Copyrights method");
	}

}
