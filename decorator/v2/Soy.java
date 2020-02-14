package decorator.v2;

public class Soy implements Condiment {
    public double cost() {
        return 0.15;
    }

    @Override
    public String toString() {
        return "Soy";
    }
}
