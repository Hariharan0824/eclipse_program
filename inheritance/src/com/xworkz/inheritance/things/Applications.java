package com.xworkz.inheritance.things;

public class Applications {
	public String applicationName;
	public String verison;
	public int size;
	public String address;
	public String developer;
	public int downloads;
	public String description;
	public String security;
	public String category;
	public boolean isPaid;
	
	public Applications() {
		
		System.out.println("APPLICATIONS-No argument constructor");
	}
	public Applications(String applicationName,String verison,int size,String address,String developer,int downloads,String description,String security,String category,boolean isPaid) {
		this.applicationName=applicationName;
		this.verison=verison;
		this.size=size;
		this.address=address;
		this.developer=developer;
		this.downloads=downloads;
		this.description=description;
		this.security=security;
		this.category=category;
		this.isPaid=isPaid;
		System.out.println("All Argument Constructor");
		System.out.println("applicationName:"+this.applicationName);
		System.out.println("verison:"+this.verison);
		System.out.println("size:"+this.size);
		System.out.println("address:"+this.address);
		System.out.println("developer:"+this.developer);
		System.out.println("downloads:"+this.downloads);
		System.out.println("description:"+this.description);
		System.out.println("security:"+this.security);
		System.out.println("category:"+this.category);
		System.out.println("isPaid:"+this.isPaid);
		}
	public void install() {
		System.out.println("Application install");
	}
	public void launch() {
		System.out.println("launch application");
	}
	public void uninstall() {
		System.out.println("application uninstall");
	}

}
