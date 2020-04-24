package Strategy;

public class Movie {

	private String title;
	private MoviePriceCode priceCode;

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

	public void setPriceCode(MoviePriceCode priceCode) {
		this.priceCode = priceCode;
	}


}