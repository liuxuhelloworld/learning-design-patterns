package compound.notrealcompound;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        Flock flockOfMallardDucks = new Flock();
        flockOfMallardDucks.add(mallardDuck1);
        flockOfMallardDucks.add(mallardDuck2);
        flockOfMallardDucks.add(mallardDuck3);
        flockOfMallardDucks.add(mallardDuck4);

        flockOfDucks.add(flockOfMallardDucks);

        System.out.println("Duck Simulator");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("Total number of quacks: " + QuackCounter.getNumberOfQuacks());
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
