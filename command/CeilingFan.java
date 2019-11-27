package command;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private String loc;
    private int speed;

    public CeilingFan() {
        this.loc = "";
        this.speed = OFF;
    }

    public CeilingFan(String loc) {
        this.loc = loc;
        this.speed = OFF;
    }

    public void off() {
        speed = OFF;
        System.out.println(loc + " " + "ceiling fan is off");
    }

    public void high() {
        speed = HIGH;
        System.out.println(loc + " " + "ceiling fan is set to high speed");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(loc + " " + "ceiling fan is set to medium speed");
    }

    public void low() {
        speed = LOW;
        System.out.println(loc + " " + "ceiling fan is set to low speed");
    }
    
    public int getSpeed() {
        return speed;
    }
}
