package example.patterns.memento.exercise;

import example.patterns.memento.exercise.operatingsystem.OperatingSystem;
import example.patterns.memento.exercise.operatingsystem.OperatingSystemCaretaker;

public class MementoExerciseRun {

    public static void main(String[] args) throws InterruptedException {
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystemCaretaker.addMemento(operatingSystem.save());
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.createBackup();
        Thread.sleep(3000);
        operatingSystem.load(operatingSystemCaretaker.getMemento());
    }
}
