package example.patterns.commandpattern.example.workshop.command;

import example.patterns.commandpattern.example.workshop.Robot;

public class RobotTurnOnCommand implements Command {

    Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void undo() {
        robot.turnOff();
    }

    @Override
    public void execute() {
        robot.turnOn();
    }
}
