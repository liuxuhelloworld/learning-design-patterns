package observer.weatherstationpullversion;

import observer.weatherstation.DisplayElement;

import java.util.Observer;
import java.util.Observable;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float minTemp;
    private float maxTemp;
    private float sumTemp;
    private int count;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;

        observable.addObserver(this);

        count = 0;
        minTemp = 100.0f;
        maxTemp = -100.0f;
        sumTemp = 0.0f;
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof Observable) {
            WeatherData weatherData = (WeatherData) obs;
            float temp = weatherData.getTemp();
            
            if (temp < minTemp) {
                minTemp = temp;
            }

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            sumTemp += temp;
            count++;

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temp = " + sumTemp/count + "/" + maxTemp + "/" + minTemp);
    }
}
