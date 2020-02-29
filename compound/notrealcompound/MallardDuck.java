package compound.notrealcompound;

public class MallardDuck implements Quackable {
    private QuackObservableHelper observable;

    public MallardDuck() {
        observable = new QuackObservableHelper(this);
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
