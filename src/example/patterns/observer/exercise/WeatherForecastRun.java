package example.patterns.observer.exercise;

import example.patterns.observer.exercise.media.InternetNews;
import example.patterns.observer.exercise.media.RadioNews;
import example.patterns.observer.exercise.media.TvNews;
import example.patterns.observer.exercise.weather.WeatherForecast;

public class WeatherForecastRun {

    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("\nNew forecast - notification only for internet:");
        weatherForecast.updateForecast(18, 1007);
    }
}
