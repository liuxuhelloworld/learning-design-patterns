package compound.notrealcompound;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        quackers.stream().forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.stream().forEach(quacker -> quacker.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
        quackers.stream().forEach(quacker -> quacker.notifyObservers());
    }
}
