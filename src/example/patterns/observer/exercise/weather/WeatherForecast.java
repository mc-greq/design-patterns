package example.patterns.observer.exercise.weather;

import example.patterns.observer.exercise.media.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable{

    private int temperature;
    private int pressure;
    private Set<Observer> observers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.updateForecast(this));
    }

    public void updateForecast(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        System.out.println("----------------------------------");
        notifyObservers();
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
