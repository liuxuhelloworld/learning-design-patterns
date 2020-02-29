package compound.notrealcompound;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        return;
    }

    @Override
    public void notifyObservers() {
        return;
    }
}
