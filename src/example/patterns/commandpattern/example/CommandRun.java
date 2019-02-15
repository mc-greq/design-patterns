package example.patterns.commandpattern.example;

import example.patterns.commandpattern.example.workshop.CoffeMaker;
import example.patterns.commandpattern.example.workshop.Robot;
import example.patterns.commandpattern.example.workshop.Workshop;
import example.patterns.commandpattern.example.workshop.command.*;

public class CommandRun {

    public static void main(String[] args) {
        Robot robot = new Robot();
        Workshop workshop = new Workshop();
//        workshop.addCommandToQueue(new RobotTurnOnCommand(robot));
//        workshop.addCommandToQueue(new RobotCutCommand(robot));
//        workshop.addCommandToQueue(new RobotTurnOffCommand(robot));
//
//        workshop.run();
//
//        CoffeMaker coffeMaker = new CoffeMaker();
//        workshop.addCommandToQueue(new CoffeMakerOn(coffeMaker));
//        workshop.addCommandToQueue(new CoffeMakerOff(coffeMaker));
//        workshop.run();

        workshop.addCommandToQueue(new RobotTurnOnCommand(robot));
        workshop.run();
        workshop.undoLastCommand();


    }

}
