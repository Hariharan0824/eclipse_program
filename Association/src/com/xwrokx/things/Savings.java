package com.xwrokx.things;

import java.sql.Date;

import com.xworkz.association.interfaces.Bank;

public class Savings{
	
	private Date startDate;
	private Date endDate;
	private int amount;
	
	
	public Savings() {
		System.out.println("This is Savings No Argument Constructor");
	}
	
	public Savings(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		
	}
	

	@Override
	public String toString() {
		return "Savings [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + "]";
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
