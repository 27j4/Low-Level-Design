package behaviouralDesignPattern.Observer.notificationService;

interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}

