package example.patterns.state.example.coffemachine;

public class NoCoinState implements State {

    @Override
    public void insertCoin(CoffeMachine coffeMachine) {
        System.out.println("Coin accepted!");
        coffeMachine.setState(new CoinInsertedState());
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Insert the coin first!");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Insert the coin first!");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Insert the coin first!");
    }
}
