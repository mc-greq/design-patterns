package example.patterns.state.example;

import example.patterns.state.example.coffemachine.CoffeMachine;

public class StateRun {

    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();

        coffeMachine.insertCoin();
        coffeMachine.takeTheCup();
    }

}
