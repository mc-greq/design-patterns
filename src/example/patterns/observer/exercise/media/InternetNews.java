package example.patterns.observer.exercise.media;

import example.patterns.observer.exercise.weather.WeatherForecast;

public class InternetNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("INTERNET - new weather forecast - " +
                "temperature: " + weatherForecast.getTemperature() +
                ", pressure: " + weatherForecast.getPressure()
        );
    }
}
