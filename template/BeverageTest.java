package template;

public class BeverageTest {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
