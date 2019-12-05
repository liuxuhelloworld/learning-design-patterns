package proxy.v3;

public class WinnerState implements State {
    private transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("current state [WINNER], can't insert quarter");
    }

    public void ejectQuarter() {
        System.out.println("current state [WINNER], can't eject quarter");
    }

    public void turnCrank() {
        System.out.println("current state [WINNER], can't turn crank");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            System.out.println("current state [WINNER], SOLD_OUT after dispense");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() == 0) {
                System.out.println("current state [WINNER], SOLD_OUT after dispense");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            } else {
                System.out.println("current state [WINNER], NO_QUARTER after dispense");
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
        }
    }
}
