package behaviouralDesignPattern.Observer.notificationService;

public class ObserverWeatherDemo {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        station.register(new CurrentConditionDisplay());
        station.register(new StatisticsDisplay());
        station.register(new ForecastDisplay());

        station.setMeasurements(30.5f, 65.0f, 1012.0f);
        station.setMeasurements(28.0f, 70.0f, 1010.5f);
    }
}
