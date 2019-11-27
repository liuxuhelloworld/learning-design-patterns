package decorator;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		setDescription("House Blend Coffee");
	}

	public double cost() {
		return 0.89;
	}
}
