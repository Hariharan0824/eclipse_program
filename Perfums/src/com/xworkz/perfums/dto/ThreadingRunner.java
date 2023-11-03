package com.xworkz.perfums.dto;

public class ThreadingRunner {

	public static void main(String[] args) {
		for(int i=0; i<=4; i++) {
		Threading threading = new Threading(i);
		Thread thread = new Thread(threading);
		thread.start();
		
		}


	}

}
