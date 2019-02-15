package example.patterns.observer.exercise.weather;

import example.patterns.observer.exercise.media.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
