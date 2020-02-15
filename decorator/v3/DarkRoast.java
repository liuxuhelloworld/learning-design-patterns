package decorator.v3;

public class DarkRoast extends Beverage {
	public double cost() {
		return 0.99;
	}

	@Override
	public String toString() {
		return "Dark Roast";
	}
}
