package com.xworkz.Instance.things;

public class Patents extends AI{

	protected String name;
	protected int noOfPatents;
	protected int importenPatents;
	protected String typesName;
	
	public Patents() {
		System.out.println("This is Patents Constructor");
	}

	public Patents(String name, int noOfPatents, int importenPatents, String typesName) {
		super("Hari",3,5,"Siva",5,8,3456,"Dinesh",9,87,"FreeWIFI",87f,"Yesterday","acb",45,"abc","qwe","treew","nimmy","fsa");
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
		System.out.println("This is Patents method");
	}
	
	
}
