package com.xwrokz.VegetableRunner;

import java.time.LocalDate;

public class PassportDTO {
	
	private int id;
	private int numbers;
	private String issuedBy;
	private LocalDate date;
	private LocalDate expiryDate;
	private PassportDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassportDTO(int id, int numbers, String issuedBy, LocalDate date, LocalDate expiryDate) {
		super();
		this.id = id;
		this.numbers = numbers;
		this.issuedBy = issuedBy;
		this.date = date;
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "PassportDTO [id=" + id + ", numbers=" + numbers + ", issuedBy=" + issuedBy + ", date=" + date
				+ ", expiryDate=" + expiryDate + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	

}
