package Strategy;
public class Rental {
	
	private Movie movie;
	private  int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;	
	}

	public Movie getMovie() {
		return movie;
	}

	public double getPrice() {
		return movie.getRentalPriceStrategy().getPrice(daysRented);
	}

	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPointsStrategy().getPoints(daysRented);
	}
		
}