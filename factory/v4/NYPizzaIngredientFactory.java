package factory.v4;

import factory.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ChicagoDough();
    }

    public Sauce createSauce() {
        return new NYSauce();
    }

    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new NYVeggies1(), new NYVeggies2()};
        return veggies;
    }

    public Clam createClam() {
        return new NYClam();
    }
}
