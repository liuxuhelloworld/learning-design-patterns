package decorator.v1;

public class Milk {
    public double cost() {
        return 0.10;
    }

    @Override
    public String toString() {
        return "Milk";
    }
}