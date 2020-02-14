package decorator.v2;

public class Espresso extends Beverage {
	public double cost() {
		return super.cost() + 1.99;
	}

	@Override
	public String toString() {
		return "Espresso" + super.toString();
	}
}
