package command.remotecontrol.vendors;

public class Stereo {
    private String loc;

    public Stereo(String loc) {
        this.loc = loc;
    }

    public void on() {
        System.out.println(loc + " " + "stereo is on");
    }

    public void off() {
        System.out.println(loc + " " + "stereo is off");
    }

    public void setCd() {
        System.out.println(loc + " " + "stereo CD is set");
    }

    public void setDvd() {
        System.out.println(loc + " " + "stereo DVD is set");
    }

    public void setRadio() {
        System.out.println(loc + " " + "stereo Radio is set");
    }

    public void setVolume(int vol) {
        System.out.println(loc + " " + "stereo volume is set on " + vol);
    }
}
