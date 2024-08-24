package DesignPatterns.ObserverDP;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" +
                " and " + pressure + " pressure");
    }

    // To register for the updates with providers
    public void registerToGetUpdates() {
        weatherData.registerObserver(this);
    }
    // to de-register from the updates from providers
    public void deRegister(){
        this.weatherData.removeObserver(this);
    }

    // If we have multiple providers , Then we can change provider.
    public void changeProvider(Subject weatherData){
        this.weatherData.removeObserver(this);
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
}
