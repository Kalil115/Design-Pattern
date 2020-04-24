package Strategy;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title, MoviePriceCode.NEW_RELEASE);
		setRentalPriceStrategy(new NewReleaseRentalPrice());
		setFrequentRenterPointsStrategy(new BonusRenterPoint());
	}

}
