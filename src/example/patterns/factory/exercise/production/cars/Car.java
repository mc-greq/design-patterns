package example.patterns.factory.exercise.production.cars;

public abstract class Car {

    private int engineCap;
    private String fuelType;
    private int productionYear;
    private String steeringWheelPosition;

    public Car(int engineCap, String fuelType, int productionYear) {
        this.engineCap = engineCap;
        this.fuelType = fuelType;
        this.productionYear = productionYear;
    }

    public int getEngineCap() {
        return engineCap;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public void setSteeringWheelPosition(String steeringWheelPosition) {
        this.steeringWheelPosition = steeringWheelPosition;
    }
}
