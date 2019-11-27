package template.v2;

public class Coffee extends CaffeineBeverage {
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void brewCoffeeGrinds() {
        System.out.println("Brew coffee grinds");
    }

    public void addSugarAndMilk() {
        System.out.println("Add sugar and milk");
    }
}
