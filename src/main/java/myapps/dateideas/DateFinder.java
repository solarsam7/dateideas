package myapps.dateideas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DateFinder {

	private List<Date> eligableDates;

	public List<Date> matchParametersToDate(DateParameters dateParameters, List<Date> dates) {
		eligableDates = new ArrayList<>();

		for (Date date : dates) {
			if (date.getPrice() <= dateParameters.getPriceLimit() && date.getDuration() <= dateParameters.getDuration()
					&& date.isStayInside() == dateParameters.isStayInside()
					&& date.isOutdoors() == dateParameters.isOutdoors()
					&& date.isHasFood() == dateParameters.isNeedFood()
					&& date.isFormal() == dateParameters.isFormal()) {
				eligableDates.add(date);
			}

		}
		return eligableDates;
	}

	public Date getFirstEligibleDate() {
		Date date = eligableDates.get(0);
		return date;
	}

	public void removeDate(Date date) {
		eligableDates.remove(date);
	}

	public Optional<Date> getAnotherEligibleDate(Date date, DateFinder dateFinder) {
		try {
			dateFinder.removeDate(date);
			Date anotherDate = dateFinder.getFirstEligibleDate();
			return Optional.ofNullable(anotherDate);
		} catch (IndexOutOfBoundsException exception) {
			return null;
		}

	}

}
