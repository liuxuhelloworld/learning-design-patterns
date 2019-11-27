package factory;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;

    protected abstract void prepare();

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza in official PizzaStrore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
