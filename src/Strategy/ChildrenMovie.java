package Strategy;

public class ChildrenMovie extends Movie {

	public ChildrenMovie(String title) {
		super(title, MoviePriceCode.CHILDREN);
		setRentalPriceStrategy(new ChildrenRentalPrice());
		setFrequentRenterPointsStrategy(new RegualrRenterPoint());
	}

}
