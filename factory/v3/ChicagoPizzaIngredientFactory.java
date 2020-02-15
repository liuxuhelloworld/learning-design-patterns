package factory.v3;

import factory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new Dough1();
    }

    public Sauce createSauce() {
        return new Sauce2();
    }

    public Cheese createCheese() {
        return new Cheese1();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Veggies1(), new Veggies2()};
        return veggies;
    }

    public Clam createClam() {
        return new Clam2();
    }
}
