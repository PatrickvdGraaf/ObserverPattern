/**
 * Class for .....
 *
 * @author Patrick van de Graaf
 */
public class CurrentConditionsDisplay implements iObserver, iDisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(iSubject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
