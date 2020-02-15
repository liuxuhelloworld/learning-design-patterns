package decorator.v3;

public abstract class Beverage {
	public abstract double cost();

	@Override
	public String toString() {
		return "Unknown Beverage";
	}
}
