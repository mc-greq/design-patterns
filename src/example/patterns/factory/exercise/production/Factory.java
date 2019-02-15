package example.patterns.factory.exercise.production;

import example.patterns.factory.exercise.production.cars.BMWModel;
import example.patterns.factory.exercise.production.cars.Car;
import example.patterns.factory.exercise.production.cars.FordModel;

public interface Factory {

    Car buildBMW(BMWModel model);
    Car buildFord(FordModel model);
}
