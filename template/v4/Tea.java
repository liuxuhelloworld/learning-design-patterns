package template.v4;

public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steep tea bag");
    }

    public void addCondiments() {
        System.out.println("Add lemon");
    }

    public boolean customerWantsCondiments() {
        return false;
    }
}