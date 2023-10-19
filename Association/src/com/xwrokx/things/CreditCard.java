package com.xwrokx.things;

import java.sql.Date;

public class CreditCard {
	Date startDate;
	Date endDate;
	int amount;
	Cards cards;
	public CreditCard() {
		System.out.println("This is CreditCard No Argument Constructor");
	}

	public CreditCard(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
	}

	public CreditCard(Cards cards) {
		super();
		this.cards = cards;
	}

	

	@Override
	public String toString() {
		return "CreditCard [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + ", cards=" + cards
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

	public Cards getCards() {
		return cards;
	}

	public void setCards(Cards cards) {
		this.cards = cards;
	}

}
