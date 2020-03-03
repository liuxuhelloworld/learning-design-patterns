package compound.mvc;

public interface BeatGenerator {
    void start();
    void stop();
    void setBPM(int bpm);
}
