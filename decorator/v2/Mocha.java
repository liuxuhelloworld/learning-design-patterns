package decorator.v2;

public class Mocha implements Condiment {
    public double cost() {
        return 0.20;
    }

    @Override
    public String toString() {
        return "Mocha";
    }
}
