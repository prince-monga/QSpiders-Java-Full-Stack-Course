package com.lamdafun;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateApi {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		
		//java api date and time
		// java.time ---Package in which persent all three classes
		//LocalDate --date
		//LocalTime --time
		//LocalTime -- date and time
		
		System.out.println(LocalDate.now()); //yyyy-MM-dd
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now()); //it returns the time
		
		//now function- It is use to get current date and time
		
		int year=2000;
		int month=12;
		int date=18;
		LocalDate da=LocalDate.of(year,month,date);
		System.out.println(da);
		da.minusMonths(20);
		System.out.println(da.minusMonths(20));
		System.out.println(da.minusDays(20));

	}

}
