package decorator;

public class Decaf extends Beverage {
	public Decaf() {
		setDescription("Decaf");
	}

	public double cost() {
		return 1.05;
	}
}
