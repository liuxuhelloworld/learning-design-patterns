package factory.v3;

import factory.ingredients.NYCheese;
import factory.ingredients.NYClam;
import factory.ingredients.NYDough;
import factory.ingredients.NYSauce;

public class NYClamPizza extends ClamPizza {

    public NYClamPizza() {
        setName("NY Clam Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new NYDough();
        sauce = new NYSauce();
        cheese = new NYCheese();
        clam = new NYClam();
    }
}
