package com.xwrokx.things;

import java.sql.Date;

public class HomeLoan {
	
	Date startDate;
	Date endDate;
	int amount;
	Loans loans;
	public HomeLoan() {
		System.out.println("This is HomeLoan No Argument Constructor");
	}

	public HomeLoan(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		
	}

	public HomeLoan(Loans loans) {
		super();
		this.loans = loans;
	}

	

	@Override
	public String toString() {
		return "HomeLoan [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + ", loans=" + loans
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

	public Loans getLoans() {
		return loans;
	}

	public void setLoans(Loans loans) {
		this.loans = loans;
	}

}
