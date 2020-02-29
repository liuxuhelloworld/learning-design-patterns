package compound.notrealcompound;

public class RedheadDuck implements Quackable {
    private QuackObservableHelper observableHelper;

    public RedheadDuck() {
        observableHelper = new QuackObservableHelper(this);
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observableHelper.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observableHelper.notifyObservers();
    }
}
