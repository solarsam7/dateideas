package myapps.dateideas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Date date1 = new Date("Walk", "Take a walk along your local park", 0, 1, false, true, false, false);
		Date date2 = new Date("Fancy Dinner", "Get dressed up and go out for a fancy meal", 50, 1.5, false, false, true,
				true);
		Date date3 = new Date("Watch a Movie", "Get some snacks and watch your partners favourite movie with them", 5,
				2, true, false, true, false);
		List<Date> dates = new ArrayList();
		dates.add(date1);
		dates.add(date2);
		dates.add(date3);

		DateParameters dateParameters = new DateParameters(20.50, 2, false, true, false, false);

		DateFinder dateFinder = new DateFinder();
		List<Date> eligableDates = dateFinder.matchParametersToDate(dateParameters, dates);

		Date uniqueDate = dateFinder.getFirstEligibleDate();

		System.out.println(uniqueDate.getName());
		System.out.println(uniqueDate.getDescription());

		Scanner myObj = new Scanner(System.in);
		System.out.println("Would you like to see another date?");
		String getAnotherDate = myObj.nextLine();

		if (getAnotherDate.equalsIgnoreCase("yes")) {
			Optional<Date> anotherUniqueDate = dateFinder.getAnotherEligibleDate(uniqueDate, dateFinder);
			if (anotherUniqueDate != null) {
				System.out.println(uniqueDate.getName());
				System.out.println(uniqueDate.getDescription());

			} else {
				System.out.println("Couldn't find another date which meets your criteria");
			}
		} else {
			System.out.println("Enjoy your date!");
		}

	}

}
