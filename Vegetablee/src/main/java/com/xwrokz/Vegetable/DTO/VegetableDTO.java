package com.xwrokz.Vegetable.DTO;

public class VegetableDTO {
	
	private int id;
	private String name;
	private int price;
	private double weight;
	
	public VegetableDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public VegetableDTO(int id, String name, int price, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "VegetableDTO [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VegetableDTO other = (VegetableDTO) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

}
