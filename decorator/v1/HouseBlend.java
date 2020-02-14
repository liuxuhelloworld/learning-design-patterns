package decorator.v1;

public class HouseBlend extends Beverage {
	public double cost() {
		return super.cost() + 0.89;
	}

	@Override
	public String toString() {
		return "House Blend Coffee" + super.toString();
	}
}
