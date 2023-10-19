package com.xwrokx.things;

import java.sql.Date;

import com.xworkz.association.interfaces.Bank;

public class Cards implements Bank{
	
	Date startDate;
	Date endDate;
	int amount;
	CreditCard creditCard;
	
	
	public Cards() {
		System.out.println("This is Cards No Argument Constructor");
	}

	public Cards(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		
	}

	@Override
	public String toString() {
		return "Cards [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + "]";
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
