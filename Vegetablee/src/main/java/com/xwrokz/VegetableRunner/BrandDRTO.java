package com.xwrokz.VegetableRunner;

public class BrandDRTO {

	private int id;
	private int number;
	private String street;
	private String city;
	private String state;
	private long pinCode;
	public BrandDRTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandDRTO(int id, int number, String street, String city, String state, long pinCode) {
		super();
		this.id = id;
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "BrandDRTO [id=" + id + ", number=" + number + ", street=" + street + ", city=" + city + ", state="
				+ state + ", pinCode=" + pinCode + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + number;
		result = prime * result + (int) (pinCode ^ (pinCode >>> 32));
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		BrandDRTO other = (BrandDRTO) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		if (pinCode != other.pinCode)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
}
