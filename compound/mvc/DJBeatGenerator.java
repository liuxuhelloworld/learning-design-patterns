package compound.mvc;

import javax.swing.*;
import java.awt.event.ActionListener;

public class DJBeatGenerator implements BeatGenerator{
    private Timer timer;

    public DJBeatGenerator(int bpm, ActionListener listener) {
        timer = new Timer(convertToDelay(bpm), listener);
    }

    @Override
    public void start() {
        timer.start();
    }

    @Override
    public void stop() {
        timer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        timer.setDelay(convertToDelay(bpm));
    }

    private int convertToDelay(int bpm) {
        return (int)(60.0 * 1000.0 / bpm);
    }
}
