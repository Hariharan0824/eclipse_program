package com.xwrokx.things;

import java.sql.Date;

import com.xworkz.association.interfaces.Bank;

public class RD implements Bank{
	
	Date startDate;
	Date endDate;
	int amount;
	Savings savings;
	
	public RD() {
		System.out.println("This is RD No Argument Constructor");
	}

	public RD(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
	}

	public RD(Savings savings) {
		super();
		this.savings = savings;
	}

	

	@Override
	public String toString() {
		return "RD [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + ", savings=" + savings
				+ "]";
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

	public Savings getSavings() {
		return savings;
	}

	public void setSavings(Savings savings) {
		this.savings = savings;
	}

	@Override
	public String accountName(String accountHolderName) {
		
		return "Krishna";
	}

	@Override
	public int num(int num) {
		
		return 12345;
	}
	

}
