package compound.mvc;

public class DJTest {
    public static void main(String[] args) {
        BeatModel model = new DJBeatModel();
        BeatController controller = new DJBeatController(model);
    }
}
