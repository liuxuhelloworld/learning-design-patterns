package observer.push;

public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float minTemp;
    private float maxTemp;
    private float sumTemp;
    private int count;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);

        count = 0;
        minTemp = 100.0f;
        maxTemp = -100.0f;
        sumTemp = 0.0f;
    }

    public void update(float temp, float humidity, float pressure) {
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

    public void display() {
        System.out.println("Avg/Max/Min temp = " + sumTemp/count + "/" + maxTemp + "/" + minTemp);
    }
}
