package factory.v3;

import factory.ingredients.NYCheese;
import factory.ingredients.NYDough;
import factory.ingredients.NYSauce;

public class NYCheesePizza extends CheesePizza {

    public NYCheesePizza() {
        setName("NY Cheese Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new NYDough();
        sauce = new NYSauce();
        cheese = new NYCheese();
    }
}
