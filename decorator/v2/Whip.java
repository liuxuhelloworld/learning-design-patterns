package decorator.v2;

public class Whip implements Condiment {
    public double cost() {
        return 0.10;
    }

    @Override
    public String toString() {
        return "Whip";
    }
}
