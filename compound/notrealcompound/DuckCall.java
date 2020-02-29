package compound.notrealcompound;

public class DuckCall implements Quackable {
    private QuackObservableHelper observableHelper;

    public DuckCall() {
        observableHelper = new QuackObservableHelper(this);
    }

    @Override
    public void quack() {
        System.out.println("DuckCall quack");
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
