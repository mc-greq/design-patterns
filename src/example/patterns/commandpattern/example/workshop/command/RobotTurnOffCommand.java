package example.patterns.commandpattern.example.workshop.command;

import example.patterns.commandpattern.example.workshop.Robot;

public class RobotTurnOffCommand implements Command {

    Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void undo() {
        robot.turnOn();
    }

    @Override
    public void execute() {
        robot.turnOff();
    }
}
