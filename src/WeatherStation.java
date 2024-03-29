/**
 * Class for running an Observer Patterns example
 *
 * The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
 * all of its dependents are notified and updated automatically
 *
 * @author Patrick van de Graaf
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.5f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
