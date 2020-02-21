package command.remotecontrol.vendors;

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    private String loc;
    private int speed;

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
