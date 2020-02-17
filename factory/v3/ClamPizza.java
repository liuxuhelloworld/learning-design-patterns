package factory.v3;

import factory.ingredients.Cheese;
import factory.ingredients.Clam;
import factory.ingredients.Dough;
import factory.ingredients.Sauce;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        setName("Clam Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new Dough();
        sauce = new Sauce();
        cheese = new Cheese();
        clam = new Clam();
    }
}
