package example.patterns.templatemethod.example;

public class ClassicalCarStartingSequence extends CarStartingSequence {

    @Override
    protected void setTheGear() {
        System.out.println("Set the gear");
    }

    @Override
    protected void startTheIgnition() {
        System.out.println("Start the ignition");
    }
}
