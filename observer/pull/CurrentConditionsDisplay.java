package observer.pull;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temp;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;

        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;

            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temp + " degrees and " + humidity + "% humidity");
    }
}
