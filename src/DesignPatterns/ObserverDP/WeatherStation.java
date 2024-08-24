package DesignPatterns.ObserverDP;

public class WeatherStation {
    public static void main(String[] args) {
        // Create a WeatherData object
        WeatherData weatherData = new WeatherData();

        // Create a new subscriber
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        currentDisplay.deRegister();
        weatherData.setMeasurements(60, 55, 25.4f);
        // Register again to see the changes
        currentDisplay.registerToGetUpdates();
        weatherData.setMeasurements(50, 45, 20.4f);
    }
}
