package factory.v3;

import factory.ingredients.*;

public class NYVeggiePizza extends VeggiePizza {

    public NYVeggiePizza() {
        setName("NY Veggie Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new NYDough();
        sauce = new NYSauce();
        cheese = new NYCheese();
        veggies = new Veggies[] {new NYVeggies1(), new NYVeggies2()};
    }
}
