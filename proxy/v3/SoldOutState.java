package proxy.v3;

public class SoldOutState implements State {
    private transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("current state [SOLD_OUT], can't insert quarter");
    }

    public void ejectQuarter() {
        System.out.println("current state [SOLD_OUT], can't eject quarter");
    }

    public void turnCrank() {
        System.out.println("current state [SOLD_OUT], can't trun crank");
    }

    public void dispense() {
        System.out.println("current state [SOLD_OUT], can't dispense");
    }
}
