package factory.v3;

import factory.ingredients.Cheese;
import factory.ingredients.Dough;
import factory.ingredients.Sauce;
import factory.ingredients.Veggies;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        setName("Veggie Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new Dough();
        sauce = new Sauce();
        cheese = new Cheese();
        veggies = new Veggies[] {new Veggies(), new Veggies()};
    }
}
