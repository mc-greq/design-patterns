package example.patterns.templatemethod.example;

public class StartTheCarRun {

    public static void main(String[] args) {
        CarStartingSequence classicalSequence = new ClassicalCarStartingSequence();
        CarStartingSequence automatedSequence = new AutomatedTransmissionStartingSequence();

        classicalSequence.startTheCar();
        System.out.println();
        automatedSequence.startTheCar();
    }
}
