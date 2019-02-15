package example.patterns.commandpattern.example.workshop.command;

import example.patterns.commandpattern.example.workshop.CoffeMaker;

public class CoffeMakerOff implements Command{

    CoffeMaker coffeMaker;

    public CoffeMakerOff(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void undo() {
        coffeMaker.turnOn();
    }

    @Override
    public void execute() {
        coffeMaker.turnOff();
    }
}
