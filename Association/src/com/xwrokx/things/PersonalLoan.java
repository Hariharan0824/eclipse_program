package com.xwrokx.things;

import java.sql.Date;

import com.xworkz.association.interfaces.Bank;

public class PersonalLoan implements Bank{
	
	Date startDate;
	Date endDate;
	int amount;
	Loans loans;
	public PersonalLoan() {
		System.out.println("This is PersonalLoan No Argument Constructor");
	}

	public PersonalLoan(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
	}

	public PersonalLoan(Loans loans) {
		super();
		this.loans = loans;
	}

	

	@Override
	public String toString() {
		return "PersonalLoan [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + ", loans="
				+ loans + "]";
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

	@Override
	public String accountName(String accountHolderName) {
		
		return "Aakash";
	}

	@Override
	public int num(int num) {
		
		return 9876;
	}

}
