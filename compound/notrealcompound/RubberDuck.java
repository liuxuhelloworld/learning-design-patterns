package compound.notrealcompound;

public class RubberDuck implements Quackable{
    private QuackObservableHelper observableHelper;

    public RubberDuck() {
        observableHelper = new QuackObservableHelper(this);
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck quack");
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
