package proxy.remote.v2;

public class NoQuarterState implements State {
    private transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("current state [NO_QUARTER], quarter inserted");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("current state [NO_QUARTER], can't eject quarter");
    }

    public void turnCrank() {
        System.out.println("current state [NO_QUARTER], can't turn crank");
    }

    public void dispense() {
        System.out.println("current state [NO_QUARTER], can't dispense");
    }
}
