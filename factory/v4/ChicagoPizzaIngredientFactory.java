package factory.v4;

import factory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ChicagoDough();
    }

    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[] {new ChicagoVeggies1(), new ChicagoVeggies2()};
    }

    public Clam createClam() {
        return new ChicagoClam();
    }
}
