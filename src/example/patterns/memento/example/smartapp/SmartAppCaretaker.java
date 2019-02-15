package example.patterns.memento.example.smartapp;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {

    private List<SmartAppMemento> mementoList = new ArrayList<>();

    public void addMemento(SmartAppMemento memento){
        mementoList.add(memento);
        System.out.println("Saved version: " + memento.getVersion() + " under id: " + (mementoList.size() -1));
    }

    public SmartAppMemento getMemento(int id){
        System.out.println("Version loaded: " + mementoList.get(id).getVersion());
        return mementoList.get(id);
    }


}
