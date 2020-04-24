package Strategy;

public interface FrequentRenterPointsStrategy {

	public int getPoints(int daysRented);

}

class RegualrRenterPoint implements FrequentRenterPointsStrategy {

	@Override
	public int getPoints(int daysRented) {
		return 1;
	}

}

class BonusRenterPoint implements FrequentRenterPointsStrategy {

	@Override
	public int getPoints(int daysRented) {
		if (daysRented > 1) {
			return 2;
		} else {
			return 1;
		}
	}

}