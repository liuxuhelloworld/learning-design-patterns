package template.v2;

public abstract class CaffeineBeverage {
    public abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("Boil water");
    }

    public void pourInCup() {
        System.out.println("Pour into cup");
    }
}
