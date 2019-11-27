package state.v1;

public class GumballMachine {
    private final static int SOLD_OUT = 0;
    private final static int NO_QUARTER = 1;
    private final static int HAS_QUARTER = 2;
    private final static int SOLD = 3;

    private int state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("current state [HAS_QUARTER], can't insert quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("current state [NO_QUARTER], quarter inserted");
        } else if (state == SOLD_OUT) {
            System.out.println("current state [SOLD_OUT], can't insert quarter");
        } else if (state == SOLD) {
            System.out.println("current state [SOLD], can't insert quarter");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            state = NO_QUARTER;
            System.out.println("current state [HAS_QUARTER], quarter returned");
        } else if (state == NO_QUARTER) {
            System.out.println("current state [NO_QUARTER], can't eject quarter");
        } else if (state == SOLD) {
            System.out.println("current state [SOLD], can't eject quarter");
        } else if (state == SOLD_OUT) {
            System.out.println("current state [SOLD_OUT], can't eject quarter");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("current state [SOLD], can't turn crank");
        } else if (state == NO_QUARTER) {
            System.out.println("current state [NO_QUARTER], can't turn crank");
        } else if (state == SOLD_OUT) {
            System.out.println("current state [SOLD_OUT], can't trun crank");
        } else if (state == HAS_QUARTER) {
            state = SOLD;
            System.out.println("current state [HAS_QUARTER], turn crank");
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            count = count - 1;
            if (count == 0) {
                state = SOLD_OUT;
                System.out.println("current state [SOLD], SOLD_OUT after dispense");
            } else {
                state = NO_QUARTER;
                System.out.println("current state [SOLD], NO_QUARTER after dispense");
            }
        } else if (state == NO_QUARTER) {
            System.out.println("current state [NO_QUARTER], can't dispense");
        } else if (state == SOLD_OUT) {
            System.out.println("current state [SOLD_OUT], can't dispense");
        } else if (state == HAS_QUARTER) {
            System.out.println("current state [HAS_QUARTER], can't dispense");
        }
    }
}