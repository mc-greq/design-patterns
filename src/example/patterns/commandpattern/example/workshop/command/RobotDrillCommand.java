package example.patterns.commandpattern.example.workshop.command;

import example.patterns.commandpattern.example.workshop.Robot;

public class RobotDrillCommand implements Command {

    Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void undo() {

    }

    @Override
    public void execute() {
        robot.drill();
    }
}
