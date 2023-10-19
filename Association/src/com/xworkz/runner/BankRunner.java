package com.xworkz.runner;

import java.util.Date;

import com.xwrokx.things.Savings;

public class BankRunner {
public static void main(String[] args) {
	Savings saving = new Savings();
	saving.setAmount(1234);
	saving.setStartDate(new Date());
	System.out.println(saving.getStartDate());
	
}
}
