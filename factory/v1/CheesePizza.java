package factory.v1;

import factory.ingredients.Cheese;
import factory.ingredients.Dough;
import factory.ingredients.Sauce;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        setName("Cheese Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new Dough();
        sauce = new Sauce();
        cheese = new Cheese();
    }
}
