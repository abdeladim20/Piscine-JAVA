import java.util.ArrayList;
import java.util.List;

public class ValuePublisher {   
    private List<NumericBaseObserver> observers = new ArrayList<>();
    private int value;
    
    public void updateState(int value) {
        this.value = value;
        for (NumericBaseObserver observer : observers) {
            observer.updateState(this.value);
        }
    }
    public void subscribe(NumericBaseObserver observer) {
        observers.add(observer);
    }
    public void unsubscribe(NumericBaseObserver observer) {
        observers.remove(observer);
    }
}