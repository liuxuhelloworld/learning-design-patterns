package compound.notrealcompound;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
