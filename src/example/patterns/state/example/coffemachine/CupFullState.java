package example.patterns.state.example.coffemachine;

public class CupFullState implements State {

    @Override
    public void insertCoin(CoffeMachine coffeMachine) {
        System.out.println("Take the cup");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Too late!");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Cup taken.");
        coffeMachine.setState(new NoCoinState());
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Take the cup first!");
    }
}
