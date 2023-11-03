package com.xwrokz.VegetableRunner;

public class BrandDTO implements Comparable<BrandDTO>{

	private String name;
	private String owner;
	private double revenueInBillion;
	private String country;
	public BrandDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandDTO(String name, String owner, double revenueInBillion, String country) {
		super();
		this.name = name;
		this.owner = owner;
		this.revenueInBillion = revenueInBillion;
		this.country = country;
	}
	@Override
	public String toString() {
		return "BrandDTO [name=" + name + ", owner=" + owner + ", revenueInBillion=" + revenueInBillion + ", country="
				+ country + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		long temp;
		temp = Double.doubleToLongBits(revenueInBillion);
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
		BrandDTO other = (BrandDTO) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (Double.doubleToLongBits(revenueInBillion) != Double.doubleToLongBits(other.revenueInBillion))
			return false;
		return true;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getRevenueInBillion() {
		return revenueInBillion;
	}
	public void setRevenueInBillion(double revenueInBillion) {
		this.revenueInBillion = revenueInBillion;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int compareTo(BrandDTO args) {
		BrandDTO temp=this;
		return temp.getName().compareTo(args.getName());
	}
	
	
	
}