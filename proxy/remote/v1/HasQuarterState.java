package proxy.remote.v1;

import java.util.Random;

public class HasQuarterState implements State {
    private GumballMachine gumballMachine;

    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("current state [HAS_QUARTER], can't insert quarter");
    }

    public void ejectQuarter() {
        System.out.println("current state [HAS_QUARTER], quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("current state [HAS_QUARTER], turn crank");

        int winner = randomWinner.nextInt(10);
        if (winner < 5 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("current state [HAS_QUARTER], can't dispense");
    }
}
