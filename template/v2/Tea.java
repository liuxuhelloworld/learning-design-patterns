package template.v2;

public class Tea extends CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void steepTeaBag() {
        System.out.println("Steep tea bag");
    }

    public void addLemon() {
        System.out.println("Add lemon");
    }
}
