package factory.v1;

import factory.ingredients.*;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        setName("Veggie Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new Dough();
        sauce = new Sauce();
        cheese = new Cheese();
        veggies = new Veggies[2];
        veggies[0] = new Veggies1();
        veggies[1] = new Veggies2();
    }
}
