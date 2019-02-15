package example.patterns.memento.exercise.operatingsystem;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento memento;

    public void addMemento(OperatingSystemMemento memento){
        this.memento = memento;
    }

    public OperatingSystemMemento getMemento() {
        return memento;
    }
}
