package behaviouralDesignPattern.Observer.notificationService;

import java.util.ArrayList;
import java.util.List;

class WeatherStation implements WeatherSubject {

    private List<WeatherObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void register(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
