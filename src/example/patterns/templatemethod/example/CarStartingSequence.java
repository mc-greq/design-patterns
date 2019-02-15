package example.patterns.templatemethod.example;

public abstract class CarStartingSequence {

    public final void startTheCar(){
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    protected abstract void setTheGear();
    protected abstract void startTheIgnition();

    private static void go(){
        System.out.println("Push the accelerator");
    }

    private static void fastenSeatbelts(){
        System.out.println("Fasten the seat belts");
    }
}
