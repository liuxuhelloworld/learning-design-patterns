package decorator.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
	private List<Condiment> condiments = new ArrayList<>();
	private Milk milk;
	private Soy soy;
	private Mocha mocha;
	private Whip whip;

	public void addCondiment(Condiment condiment) {
		condiments.add(condiment);
	}

	public double cost() {
	    double cost = 0.0;
	    for (Condiment c : condiments) {
	    	cost += c.cost();
		}
	    return cost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (Condiment c : condiments) {
			builder.append(", " + c);
		}
		return builder.toString();
	}
}