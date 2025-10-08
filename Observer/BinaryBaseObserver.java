import java.util.ArrayList;
import java.util.List;

public class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events = new ArrayList<>();
    private int state;

    public void updateState(int state) {
        this.state = state;
        events.add(Integer.toBinaryString(this.state));
    }

    public List<String> getEvents() {
        return this.events;
    }
}