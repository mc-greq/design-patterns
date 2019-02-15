package example.patterns.factory.exercise.production;

import example.patterns.factory.exercise.production.cars.*;

public class CommonwealthFactory implements Factory {

    String steeringWheelPosition = "RIGHT";

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model){
            case E60:
                Car bmw = new BMW(2000, "diesel", 2019);
                bmw.setSteeringWheelPosition(steeringWheelPosition);
                return bmw;

            default:
                throw new IllegalArgumentException("No model");
        }


    }

    @Override
    public Car buildFord(FordModel model) {
        switch (model){
            case CMAX:
                Car ford = new Ford(1600, "gasoline", 2019);
                ford.setSteeringWheelPosition(steeringWheelPosition);
                return ford;

            default:
                throw new IllegalArgumentException("No model");
        }
    }
}
