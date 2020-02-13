package observer.weatherstation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temp;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temp + " degrees and " + humidity + "% humidity");
    }
}
