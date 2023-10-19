package com.xwrokx.things;

import java.sql.Date;

public class GeneralInsurance {
	
	Date startDate;
	Date endDate;
	int amount;
	Insurance insurance;
	
	public GeneralInsurance() {
		System.out.println("This is GeneralInsurance No Argument Constructor");
	}

	public GeneralInsurance(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
	}

	public GeneralInsurance(Insurance insurance) {
		super();
		this.insurance = insurance;
	}

	

	@Override
	public String toString() {
		return "GeneralInsurance [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount
				+ ", insurance=" + insurance + "]";
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

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

}
