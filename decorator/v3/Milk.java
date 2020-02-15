package decorator.v3;

public class Milk extends CondimentDecorator {
	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public double cost() {
		return beverage.cost() + 0.10;
	}

	@Override
	public String toString() {
		return beverage + ", Steamed Milk";
	}
}

