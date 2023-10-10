package com.xworkz.GroceryDTO;

public class GroceryDTO {
	
	private String name;
	private String type;
	private double price;
	public String getName() 
	
	{
		return name;
	}
	public GroceryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", type=" + type + ", price=" + price + ", getName()=" + getName()
				+ ", getType()=" + getType() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
