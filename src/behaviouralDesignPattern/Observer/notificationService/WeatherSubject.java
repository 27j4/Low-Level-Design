package behaviouralDesignPattern.Observer.notificationService;

interface WeatherSubject {
    void register(WeatherObserver observer);
    void remove(WeatherObserver observer);
    void notifyObservers();
}
