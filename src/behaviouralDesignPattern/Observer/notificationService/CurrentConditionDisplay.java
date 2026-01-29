package behaviouralDesignPattern.Observer.notificationService;

class CurrentConditionDisplay implements WeatherObserver {

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current Conditions: " +
                temperature + "°C, " + humidity + "% humidity");
    }
}
