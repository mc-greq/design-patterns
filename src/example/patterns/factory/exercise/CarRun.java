package example.patterns.factory.exercise;

import example.patterns.factory.exercise.production.*;
import example.patterns.factory.exercise.production.cars.BMWModel;
import example.patterns.factory.exercise.production.cars.Car;
import example.patterns.factory.exercise.production.cars.FordModel;

public class CarRun {

    public static void main(String[] args) {

        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());

    }
}
