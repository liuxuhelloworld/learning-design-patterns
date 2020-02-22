package adapter.duckandturkey;

public class TurkeyAdapterTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck says...");
        testDuck(duck);

        System.out.println("the turkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
