package compound.notrealcompound;

import java.util.ArrayList;
import java.util.List;

public class QuackObservableHelper implements QuackObservable {
    private List<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public QuackObservableHelper(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.update(duck));
    }
}
