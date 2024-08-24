package DesignPatterns.ObserverDP;

public class ForeCastDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private float lastPressure;
    private Subject weatherData;

    public ForeCastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        lastPressure = this.pressure;
        this.pressure = pressure;
        display();
    }

    public void display() {
        if (pressure > lastPressure) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (pressure == lastPressure) {
            System.out.println("Forecast: More of the same");
        } else if (pressure < lastPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        }
    }
}
