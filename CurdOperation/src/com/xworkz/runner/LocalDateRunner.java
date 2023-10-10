package com.xworkz.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {
	public static void main(String[] args) {

		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);

		LocalDate past = LocalDate.of(2000, 12, 8);
		System.out.println(past);

		LocalDate future = LocalDate.of(2000, 12, 8);
		System.out.println(future);

		boolean date = localdate.equals(future);
		System.out.println(date);

		LocalDateTime locatdatetime = LocalDateTime.now();
		System.out.println(locatdatetime);

		LocalDateTime pasttime = LocalDateTime.of(2000, 12, 12, 12, 23);
		System.out.println(pasttime);

		LocalDateTime futuretime = LocalDateTime.of(2000, 12, 12, 12, 23);
		System.out.println(futuretime);

		boolean time = locatdatetime.isAfter(futuretime);
		System.out.println(time);

	}

}
