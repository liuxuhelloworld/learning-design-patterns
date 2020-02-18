package factory.v4;

import factory.ingredients.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new NYDough();
    }

    public Sauce createSauce() {
        return new NYSauce();
    }

    public Cheese createCheese() {
        return new NYCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[] {new NYVeggies1(), new NYVeggies2()};
    }

    public Clam createClam() {
        return new NYClam();
    }
}
