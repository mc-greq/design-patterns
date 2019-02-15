package example.patterns.state.example.coffemachine;

public class CoinInsertedState implements State {

    @Override
    public void insertCoin(CoffeMachine coffeMachine) {
        System.out.println("Coin already inserted");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Returning the coin");
        coffeMachine.setState(new NoCoinState());
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Push the button");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Pouring coffee...");
        coffeMachine.setState(new CupFullState());
    }
}
