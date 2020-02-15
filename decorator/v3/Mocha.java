package decorator.v3;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public double cost() {
		return beverage.cost() + 0.20;
	}

	@Override
	public String toString() {
		return beverage + ", Mocha";
	}
}
