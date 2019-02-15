package example.patterns.commandpattern.example.workshop.command;

import example.patterns.commandpattern.example.workshop.CoffeMaker;

public class CoffeMakerOn implements Command {

    CoffeMaker coffeMaker;

    public CoffeMakerOn(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void undo() {
        coffeMaker.turnOff();
    }

    @Override
    public void execute() {
        coffeMaker.turnOn();
    }
}
