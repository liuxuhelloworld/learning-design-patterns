package factory.v3;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new NYClamPizza();
        }

        return pizza;
    }
}
