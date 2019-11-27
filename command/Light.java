package command;

public class Light {
    private String loc;

    public Light() {
        this.loc = "";
    }

    public Light(String loc) {
        this.loc = loc;
    }

    public void on() {
        System.out.println(loc + " " + "light is on");
    }

    public void off() {
        System.out.println(loc + " " + "light is off");
    }
}
