package decorator.v1;

public abstract class Beverage {
	private Milk milk;
	private Soy soy;
	private Mocha mocha;
	private Whip whip;

	public double cost() {
	    double cost = 0.0;
	    if (hasMilk()) {
	    	cost += milk.cost();
		}
	    if (hasSoy()) {
	    	cost += soy.cost();
		}
	    if (hasMocha()) {
	    	cost += mocha.cost();
		}
	    if (hasWhip()) {
	    	cost += whip.cost();
		}

	    return cost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (hasMilk()) {
			builder.append(", " + milk);
		}
		if (hasSoy()) {
			builder.append(", " + soy);
		}
		if (hasMocha()) {
			builder.append(", " + mocha);
		}
		if (hasWhip()) {
			builder.append(", " + whip);
		}
		return builder.toString();
	}

	public boolean hasMilk() {
		return milk != null;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public boolean hasSoy() {
		return soy != null;
	}

	public void setSoy(Soy soy) {
		this.soy = soy;
	}

	public boolean hasMocha() {
		return mocha != null;
	}

	public void setMocha(Mocha mocha) {
		this.mocha = mocha;
	}

	public boolean hasWhip() {
		return whip != null;
	}

	public void setWhip(Whip whip) {
		this.whip = whip;
	}
}
