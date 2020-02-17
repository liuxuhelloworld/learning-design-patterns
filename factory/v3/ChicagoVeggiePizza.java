package factory.v3;

import factory.ingredients.*;

public class ChicagoVeggiePizza extends VeggiePizza {

    public ChicagoVeggiePizza() {
        setName("Chicago Veggie Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new ChicagoDough();
        sauce = new ChicagoSauce();
        cheese = new ChicagoCheese();
        veggies = new Veggies[] {new ChicagoVeggies1(), new ChicagoVeggies2()};
    }
}
