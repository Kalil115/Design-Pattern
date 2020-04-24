package Strategy;
import java.util.List;

public class Cashier {
	
	private static Cashier onlyCashier = null;
	
	private Cashier() {
	}
	
	public synchronized static Cashier getCashier() {
		if(onlyCashier == null) {
			onlyCashier = new Cashier();
		}
		
		return onlyCashier;
		
	}

	public String generateStatement(Customer customer) {

		double totalAmount = 0;
		int frequentRenterPoints = 0;

		List<Rental> rentals = customer.getRentals();
		StringBuilder statement = new StringBuilder("Rental Record for " + customer.getName() + ":\n");

		for (Rental rental : rentals) {

			double subtotal = rental.getPrice();
			frequentRenterPoints += rental.getFrequentRenterPoints();

			// show figures for this rental
			statement.append("\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(subtotal) + "\n");
			totalAmount += subtotal;

		}

		// store Frequent Renter Points to the customer
		customer.setFrequentRenterPoints(frequentRenterPoints);

		// add footer lines
		statement.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
		statement.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
		return statement.toString();
	}
}
