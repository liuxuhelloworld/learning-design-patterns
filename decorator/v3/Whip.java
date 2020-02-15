package decorator.v3;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public double cost() {
		return beverage.cost() + 0.10;
	}

	@Override
	public String toString() {
		return beverage + ", Whip";
	}
}
