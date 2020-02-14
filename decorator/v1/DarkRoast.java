package decorator.v1;

public class DarkRoast extends Beverage {
	public double cost() {
		return super.cost() + 0.99;
	}

	@Override
	public String toString() {
		return "Dark Roast" + super.toString();
	}
}
