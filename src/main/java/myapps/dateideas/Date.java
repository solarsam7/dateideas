package myapps.dateideas;

public class Date {

	private String name;

	private String description;

	private double price;

	private double duration;

	private boolean stayInside;

	private boolean isOutdoors;

	private boolean hasFood;

	private boolean isFormal;

	public Date(String name, String description, double price, double duration, boolean stayInside, boolean isOutdoors,
			boolean hasFood, boolean isFormal) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.duration = duration;
		this.stayInside = stayInside;
		this.isOutdoors = isOutdoors;
		this.hasFood = hasFood;
		this.isFormal = isFormal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
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

	public boolean isHasFood() {
		return hasFood;
	}

	public void setHasFood(boolean hasFood) {
		this.hasFood = hasFood;
	}

	public boolean isFormal() {
		return isFormal;
	}

	public void setFormal(boolean isFormal) {
		this.isFormal = isFormal;
	}

	@Override
	public String toString() {
		return "Date [name=" + name + ", description=" + description + ", price=" + price + ", duration=" + duration
				+ ", stayInside=" + stayInside + ", isOutdoors=" + isOutdoors + ", hasFood=" + hasFood + ", isFormal="
				+ isFormal + "]";
	}

}
