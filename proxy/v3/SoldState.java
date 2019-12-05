package proxy.v3;

public class SoldState implements State {
    private transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("current state [SOLD], can't insert quarter");
    }

    public void ejectQuarter() {
        System.out.println("current state [SOLD], can't eject quarter");
    }

    public void turnCrank() {
        System.out.println("current state [SOLD], can't turn crank");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("current state [SOLD], SOLD_OUT after dispense");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            System.out.println("current state [SOLD], NO_QUARTER after dispense");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
