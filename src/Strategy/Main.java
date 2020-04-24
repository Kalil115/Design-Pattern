package Strategy;

public class Main {
	public static void main(String[] args) {

		// create test customers
		Customer alex = new Customer("Alex");
		Customer bob = new Customer("Bob");
		Customer chris = new Customer("Chris");

		// create new movies
		Movie m1 = new RegularMovie("The Martian");
		Movie m2 = new ChildrenMovie("Inside Out");
		Movie m3 = new NewReleaseMovie("How to Train Your Dragon 3");
		Movie m4 = new RegularMovie("A Star is Born");
		Movie m5 = new ChildrenMovie("Spider-Man");
		Movie m6 = new NewReleaseMovie("Aquaman");
		Movie m7 = new RegularMovie("Inception");
		Movie m8 = new ChildrenMovie("Ralph Breaks the Internet");
		Movie m9 = new NewReleaseMovie("Venom");

		// rental 
		alex.addRental(new Rental(m1, 2));
		alex.addRental(new Rental(m2, 6));
		alex.addRental(new Rental(m3, 3));
		bob.addRental(new Rental(m4, 5));
		bob.addRental(new Rental(m5, 4));
		bob.addRental(new Rental(m6, 3));
		chris.addRental(new Rental(m7, 2));
		chris.addRental(new Rental(m8, 1));
		chris.addRental(new Rental(m9, 9));

		Cashier cashier = Cashier.getCashier();
		
		// print results
		String statement = cashier.generateStatement(alex);
		System.out.println(statement);
		System.out.println();
		
		String statement2 = cashier.generateStatement(bob);
		System.out.println(statement2);
		System.out.println();
		
		String statement3 = cashier.generateStatement(chris);
		System.out.println(statement3);

	}
}
