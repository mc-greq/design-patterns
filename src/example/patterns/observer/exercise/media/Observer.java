package example.patterns.observer.exercise.media;

import example.patterns.observer.exercise.weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
