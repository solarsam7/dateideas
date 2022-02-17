package myapps.dateideas;

import java.util.ArrayList;
import java.util.List;

public class DateFinder {
	
	private List<Date> eligableDates;
	
	public List<Date> matchParametersToDate(DateParameters dateParameters, List<Date> dates) {
		eligableDates = new ArrayList<>();
		
		for (Date date : dates){
			if (date.getPrice() <= dateParameters.getPriceLimit()
					&& date.getDuration() <= dateParameters.getDuration()
					&& date.isStayInside() == dateParameters.isStayInside()
					&& date.isOutdoors() == dateParameters.isOutdoors()
					&& date.isHasFood() == dateParameters.isNeedFood()
					&& date.isFormal() == dateParameters.isFormal()) {
				eligableDates.add(date);
			}
			
		}
		return eligableDates;
	}

}
