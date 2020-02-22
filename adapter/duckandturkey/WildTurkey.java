package adapter.duckandturkey;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
