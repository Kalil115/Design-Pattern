package Strategy;
import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<>();
	private int frequentRenterPoints = 0;

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void addRental(Rental newRental) {
		if (newRental != null) {
			rentals.add(newRental);
		}
	}

	public void setFrequentRenterPoints(int frequentRenterPoints) {
		this.frequentRenterPoints = frequentRenterPoints;
	}

	public int getFrequentRenterPoints() {
		return frequentRenterPoints;
	}
}