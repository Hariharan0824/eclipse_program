package com.xwrokx.things;

import java.sql.Date;

public class DebitCard {
	
	Date startDate;
	Date endDate;
	int amount;
	Cards cards;
	
	public DebitCard() {
		System.out.println("This is DebitCard No Argument Constructor");
	}

	public DebitCard(Date startDate, Date endDate, int amount) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
	}

	

	

	

	@Override
	public String toString() {
		return "DebitCard [startDate=" + startDate + ", endDate=" + endDate + ", amount=" + amount + ", cards=" + cards
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
