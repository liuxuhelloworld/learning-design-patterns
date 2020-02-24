package template.v4;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Brew coffee grinds");
    }

    public void addCondiments() {
        System.out.println("Add sugar and milk");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}