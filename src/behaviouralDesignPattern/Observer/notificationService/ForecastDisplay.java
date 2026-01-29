package behaviouralDesignPattern.Observer.notificationService;

class ForecastDisplay implements WeatherObserver {

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast display updated");
    }
}
