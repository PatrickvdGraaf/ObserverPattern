import java.util.ArrayList;

/**
 * Representing all Weather Data. This means it is a Subject, and maintains a list of observers
 */
public class WeatherData implements iSubject{
    private ArrayList<iObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(iObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(iObserver o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(iObserver observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * We notify Observers when we get updated measurements from the Weather Station
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
