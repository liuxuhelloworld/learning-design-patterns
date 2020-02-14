package decorator.v2;

public class Milk implements Condiment {
    public double cost() {
        return 0.10;
    }

    @Override
    public String toString() {
        return "Milk";
    }
}