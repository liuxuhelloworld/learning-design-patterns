package compound.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DJBeatModel implements BeatModel, ActionListener {
    private List<BeatObserver> beatObservers = new ArrayList<>();
    private List<BPMObserver> bpmObservers = new ArrayList<>();
    private int bpm = 90;
    private BeatGenerator beatGenerator;

    @Override
    public void initialize() {
        beatGenerator = new DJBeatGenerator(bpm, this);
    }

    @Override
    public void on() {
        beatGenerator.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        beatGenerator.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        beatGenerator.setBPM(bpm);
        notifyBPMObservers();
    }

    private void notifyBPMObservers() {
        bpmObservers.stream().forEach(BPMObserver::updateBPM);
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        beatObservers.add(observer);
    }


    @Override
    public void registerObserver(BPMObserver observer) {
        bpmObservers.add(observer);
    }


    @Override
    public void removeObserver(BPMObserver observer) {
        bpmObservers.remove(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        beatObservers.remove(observer);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        notifyBeatObservers();
    }

    private void notifyBeatObservers() {
        beatObservers.stream().forEach(BeatObserver::updateBeat);
    }
}
