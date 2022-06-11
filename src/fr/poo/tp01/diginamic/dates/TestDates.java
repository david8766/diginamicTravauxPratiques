package fr.poo.tp01.diginamic.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// Create an instance of the java.util.Date class with today's date using one of
		// its constructors
		System.out.println(
				"Créez une instance de la classe java.util.Date à la date du jour en utilisant un de ses constructeurs");
		Date today = new Date();
		System.out.println("Date du jour: " + today);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = dateFormat.format(today);
		System.out.println("Date du jour au format jour/mois/année: " + strDate);

		// Create an instance of the Date class with the date 2016-05-19 at 23:59:30
		// seconds
		System.out.println("Créez une instance de la classe Date à la date du 19/05/2016 à 23:59:30 secondes");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date customDate = null;
		try {
			customDate = df.parse("19-05-2016 23:59:30");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String strDate2 = df.format(customDate);
		System.out.println("Date demandée au format jour/mois/année heure:minute:secondes ->  " + strDate2);

	}

}
