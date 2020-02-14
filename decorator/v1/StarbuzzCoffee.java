package decorator.v1;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Mocha mocha = new Mocha();
		Soy soy = new Soy();
		Whip whip = new Whip();

		Beverage beverage = new Espresso();
		System.out.println(beverage + " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2.setMocha(mocha);
		beverage2.setWhip(whip);
		System.out.println(beverage2 + " $" + beverage2.cost());

		Beverage beverage3= new HouseBlend();
		beverage3.setSoy(soy);
		beverage3.setMocha(mocha);
		beverage3.setWhip(whip);
		System.out.println(beverage3 + " $" + beverage3.cost());
	}
}
