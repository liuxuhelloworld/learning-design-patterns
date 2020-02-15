package decorator.v3;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public double cost() {
		return beverage.cost() + 0.15;
	}

	@Override
	public String toString() {
		return beverage + ", Soy";
	}
}
