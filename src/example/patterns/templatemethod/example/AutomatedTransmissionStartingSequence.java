package example.patterns.templatemethod.example;

public class AutomatedTransmissionStartingSequence extends ClassicalCarStartingSequence {

    @Override
    protected void setTheGear() {
        System.out.println("Automated transmission");
    }
}
