package Strategy;
public abstract class Movie {

	private String title;
	private MoviePriceCode priceCode;
	private RentalPriceStrategy rentalPriceStrategy;
	private FrequentRenterPointsStrategy frequentRenterPointsStrategy;

	public Movie(String title, MoviePriceCode priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public MoviePriceCode getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(MoviePriceCode newPriceCode) {
		this.priceCode = newPriceCode;
	}

	public RentalPriceStrategy getRentalPriceStrategy() {
		return rentalPriceStrategy;
	}

	public void setRentalPriceStrategy(RentalPriceStrategy rentalPriceStrategy) {
		this.rentalPriceStrategy = rentalPriceStrategy;
	}

	public FrequentRenterPointsStrategy getFrequentRenterPointsStrategy() {
		return frequentRenterPointsStrategy;
	}

	public void setFrequentRenterPointsStrategy(FrequentRenterPointsStrategy frequentRenterPointsStrategy) {
		this.frequentRenterPointsStrategy = frequentRenterPointsStrategy;
	}

}