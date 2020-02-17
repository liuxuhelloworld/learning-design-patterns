package factory.v4;

import factory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new NYDough();
    }

    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    public Cheese createCheese() {
        return new NYCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new NYVeggies1(), new NYVeggies2()};
        return veggies;
    }

    public Clam createClam() {
        return new ChicagoClam();
    }
}
