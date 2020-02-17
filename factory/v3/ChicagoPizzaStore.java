package factory.v3;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoClamPizza();
        }

        return pizza;
    }
}
