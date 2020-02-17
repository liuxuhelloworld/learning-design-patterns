package factory.v3;

import factory.ingredients.*;

public class ChicagoClamPizza extends ClamPizza {

    public ChicagoClamPizza() {
        setName("Chicago Clam Pizza");
    }

    public void prepare() {
        System.out.println("Preparing " + name);

        dough = new ChicagoDough();
        sauce = new ChicagoSauce();
        cheese = new ChicagoCheese();
        clam = new ChicagoClam();
    }
}
