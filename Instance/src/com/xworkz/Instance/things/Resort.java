package com.xworkz.Instance.things;

public class Resort {
	String name="Hari";
	String typeOFResort;
	int noOfWorkers;
	MenuList menuList;
	
	public Resort() {
		System.out.println("This is Resort Constructor");
	}

	public Resort(String typeOFResort, int noOfWorkers) {
		//super();
	
		this.typeOFResort = typeOFResort;
		this.noOfWorkers = noOfWorkers;
	}

	/*public Resort(String name, String typeOFResort, int noOfWorkers, MenuList menuList) {
		//super();
		this.name = name;
		this.typeOFResort = typeOFResort;
		this.noOfWorkers = noOfWorkers;
		this.menuList = menuList;
	}*/
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("typeOFResort:"+this.typeOFResort);
		System.out.println("noOfWorkers:"+this.noOfWorkers);
		System.out.println("menuList:"+this.menuList);
	}
	public void setvalue(MenuList menuList) {
		this.menuList=menuList;
		
	}

}
