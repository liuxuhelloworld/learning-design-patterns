package template.v1;

public class Coffee {
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater() {
        System.out.println("Boil water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Brew coffee grinds");
    }

    public void pourInCup() {
        System.out.println("Pour into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Add sugar and milk");
    }
}
