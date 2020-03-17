package builder.v4;

public class PizzaTest {
    public static void main(String[] args) {
        NYPizza nyPizza = new NYPizza.Builder(NYPizza.Size.SMALL)
            .addTopping(Pizza.Topping.SAUSAGE)
            .addTopping(Pizza.Topping.OINON)
            .build();

        CalzonePizza calzonePizza = new CalzonePizza.Builder()
            .addTopping(Pizza.Topping.HAM)
            .sauceInside()
            .build();

        System.out.println(nyPizza);
        System.out.println(calzonePizza);
    }
}
