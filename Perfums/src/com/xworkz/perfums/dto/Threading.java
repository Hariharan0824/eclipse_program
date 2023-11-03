package com.xworkz.perfums.dto;

public class Threading implements Runnable{
	
	private int num;
	public Threading(int num) {

		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(i+ " is running thread "+ num);
			if(num==3) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
