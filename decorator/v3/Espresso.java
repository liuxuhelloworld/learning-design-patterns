package decorator.v3;

public class Espresso extends Beverage {
	public double cost() {
		return 1.99;
	}

	@Override
	public String toString() {
		return "Espresso";
	}
}
