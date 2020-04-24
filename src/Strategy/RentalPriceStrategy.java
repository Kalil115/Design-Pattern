package Strategy;

public abstract class RentalPriceStrategy {

	private double basecost;
	private int minDays;
	private double rate;

	protected void setVariables(double basecost, int minDays, double rate) {
		this.basecost = basecost;
		this.minDays = minDays;
		this.rate = rate;
	}

	public double getPrice(int daysRented) {
		return basecost + Math.max((daysRented - minDays), 0) * rate;
	}

}

class NewReleaseRentalPrice extends RentalPriceStrategy {

	public NewReleaseRentalPrice() {
		setVariables(0.0, 0, 3.0);
	}

}

class RegularRentalPrice extends RentalPriceStrategy {

	public RegularRentalPrice() {
		setVariables(2.0, 2, 1.5);
	}

}

class ChildrenRentalPrice extends RentalPriceStrategy {

	public ChildrenRentalPrice() {
		setVariables(1.5, 3, 1.5);
	}
}
