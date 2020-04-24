package Strategy;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, MoviePriceCode.REGULAR);
		setRentalPriceStrategy(new RegularRentalPrice());
		setFrequentRenterPointsStrategy(new RegualrRenterPoint());
	}
}
