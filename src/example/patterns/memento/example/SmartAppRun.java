package example.patterns.memento.example;

import example.patterns.memento.example.smartapp.SmartApp;
import example.patterns.memento.example.smartapp.SmartAppCaretaker;

public class SmartAppRun {

    public static void main(String[] args) {
        SmartAppCaretaker caretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        caretaker.addMemento(smartApp.saveVersion());

        smartApp.changeVersion(2.0);
        smartApp.changeVersion(2.1);
        smartApp.changeVersion(2.2);

        smartApp.loadVersion(caretaker.getMemento(0));

    }
}
