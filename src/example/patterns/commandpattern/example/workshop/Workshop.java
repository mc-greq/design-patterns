package example.patterns.commandpattern.example.workshop;

import example.patterns.commandpattern.example.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

    private List<Command> commandQueue = new ArrayList<>();

    public void addCommandToQueue(Command command){
        commandQueue.add(command);
    }

    public void run(){
        if(commandQueue.isEmpty()){
            System.out.println("Command queue empty!");
        }

        commandQueue.forEach(Command::execute);
//        commandQueue.clear();

    }

    public void undoLastCommand(){
        commandQueue.forEach(Command::undo);
    }
}
