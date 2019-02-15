package example.patterns.memento.example.smartapp;

class SmartAppMemento {

    private double version;

    public SmartAppMemento(double version) {
        this.version = version;
    }

    double getVersion() {
        return version;
    }
}
