package com.xwrokx.things;

import java.sql.Date;

import com.xworkz.association.interfaces.Bank;

public class Insurance implements Bank{
	Date startDate;
	Date endDate;
	int amount;
	
	
	
	public Insurance() {
		System.out.println("This is Insurance No Argument Constructor");
	}


	public Insurance(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		
	}


	@Override
	public String toString() {
		return "Insurance [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + "]";
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	

}
