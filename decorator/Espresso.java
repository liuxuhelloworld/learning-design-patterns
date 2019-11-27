package decorator;

public class Espresso extends Beverage {
	public Espresso() {
		setDescription("Espresso");
	}

	public double cost() {
		return 1.99;
	}
}
