package myapps.dateideas;

public class DateParameters {
	
    private double priceLimit;
	
	private double duration;
	
	private boolean stayInside;
	
	private boolean isOutdoors;
	
	private boolean needFood;
	
	private boolean isFormal;

	public DateParameters(double priceLimit, double duration, boolean stayInside, boolean isOutdoors,
			boolean needFood, boolean isFormal) {
		super();
		this.priceLimit = priceLimit;
		this.duration = duration;
		this.stayInside = stayInside;
		this.isOutdoors = isOutdoors;
		this.needFood = needFood;
		this.isFormal = isFormal;
	}

	public double getPriceLimit() {
		return priceLimit;
	}

	public void setPriceLimit(float priceLimit) {
		this.priceLimit = priceLimit;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public boolean isStayInside() {
		return stayInside;
	}

	public void setStayInside(boolean stayInside) {
		this.stayInside = stayInside;
	}

	public boolean isOutdoors() {
		return isOutdoors;
	}

	public void setOutdoors(boolean isOutdoors) {
		this.isOutdoors = isOutdoors;
	}

	public boolean isNeedFood() {
		return needFood;
	}

	public void setNeedFood(boolean needFood) {
		this.needFood = needFood;
	}

	public boolean isFormal() {
		return isFormal;
	}

	public void setFormal(boolean isFormal) {
		this.isFormal = isFormal;
	}

	@Override
	public String toString() {
		return "DateParameters [priceLimit=" + priceLimit + ", duration=" + duration + ", stayInside=" + stayInside
				+ ", isOutdoors=" + isOutdoors + ", needFood=" + needFood + ", isFormal=" + isFormal + "]";
	}

	
	
	

	
	
	

}
