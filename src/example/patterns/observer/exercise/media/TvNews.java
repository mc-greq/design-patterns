package example.patterns.observer.exercise.media;

import example.patterns.observer.exercise.weather.WeatherForecast;

public class TvNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV - new weather forecast - " +
                "temperature: " + weatherForecast.getTemperature() +
                ", pressure: " + weatherForecast.getPressure()
        );
    }
}
