package myapps.dateideas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Date date1 = new Date("Walk", "Take a walk along your local park", 0, 1, false, true, false, false);
		Date date2 = new Date("Fancy Dinner", "Get dressed up and go out for a fancy meal", 50, 1.5, false, false, true, true);
		Date date3 = new Date("Watch a Movie", "Get some snacks and watch your partners favourite movie with them", 5, 2, true, false, true, false);
		List<Date> dates = new ArrayList();
		dates.add(date1);
		dates.add(date2);
		dates.add(date3);
		
		DateParameters dateParameters = new DateParameters(20.50, 2, false, true, false, false);
		
		DateFinder dateFinder = new DateFinder();
		List<Date> eligableDates = dateFinder.matchParametersToDate(dateParameters, dates);
		
		for (Date date : eligableDates) {
			System.out.println(date.getName());
			System.out.println(date.getDescription());
		}
		

	}

}
