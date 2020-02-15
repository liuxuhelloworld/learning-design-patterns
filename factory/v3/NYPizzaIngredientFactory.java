package factory.v3;

import factory.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new Dough2();
    }

    public Sauce createSauce() {
        return new Sauce1();
    }

    public Cheese createCheese() {
        return new Cheese2();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Veggies1(), new Veggies2()};
        return veggies;
    }

    public Clam createClam() {
        return new Clam1();
    }
}
