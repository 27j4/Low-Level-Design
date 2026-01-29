package behaviouralDesignPattern.Observer.notificationService;

class StatisticsDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics updated with new weather data");
    }
}
