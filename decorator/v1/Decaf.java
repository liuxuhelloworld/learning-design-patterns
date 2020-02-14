package decorator.v1;

public class Decaf extends Beverage {
	public double cost() {
		return super.cost() + 1.05;
	}

	@Override
	public String toString() {
		return "Decaf" + super.toString();
	}
}
