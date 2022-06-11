package fr.poo.tp01.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		/*
		 * Use the java.util.Calendar class to create an instance of Date with the date
		 * May 19, 2016 at 11:59:30 p.m. and display it in the following format:
		 * day/month/year
		 */
		Calendar cal = Calendar.getInstance();

		cal.set(2016, 05, 19, 23, 59, 30);
		Date date = cal.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = dateFormat.format(date);
		System.out.println("Date demandée au format jour/mois/année: " + strDate);

		/*
		 * Use the java.util.Calendar class to create an instance of Date on today's
		 * date. o Display the instance thus created in the following format:
		 * year/month/day hour:minute:second
		 */

		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String strDate2 = dateFormat2.format(date2);
		System.out.println("Date du jour au format jour/mois/année: " + strDate2);

	}

}
