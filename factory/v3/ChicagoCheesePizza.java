package factory.v3;

import factory.ingredients.ChicagoCheese;
import factory.ingredients.ChicagoDough;
import factory.ingredients.ChicagoSauce;

public class ChicagoCheesePizza extends CheesePizza {

    public ChicagoCheesePizza() {
        setName("Chicago Cheese Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new ChicagoDough();
        sauce = new ChicagoSauce();
        cheese = new ChicagoCheese();
    }
}
