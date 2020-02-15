package decorator.v3;

public class Decaf extends Beverage {
	public double cost() {
		return 1.05;
	}

	@Override
	public String toString() {
		return "Decaf";
	}
}
