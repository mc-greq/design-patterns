package example.patterns.memento.example.smartapp;

public class SmartApp {

    private Double version;

    public void changeVersion(Double version){
        this.version = version;
        System.out.println("New version: " + version);
    }

    public SmartAppMemento saveVersion(){
        return new SmartAppMemento(this.version);
    }

    public void loadVersion(SmartAppMemento memento){
        this.version = memento.getVersion();
    }

}
