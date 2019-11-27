package template.v1;

public class Tea {
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater() {
        System.out.println("Boil water");
    }

    public void steepTeaBag() {
        System.out.println("Steep tea bag");
    }

    public void pourInCup() {
        System.out.println("Pour into cup");
    }

    public void addLemon() {
        System.out.println("Add lemon");
    }
}
