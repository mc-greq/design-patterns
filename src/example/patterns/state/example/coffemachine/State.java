package example.patterns.state.example.coffemachine;

public interface State {
    void insertCoin(CoffeMachine coffeMachine);
    void returnTheCoin(CoffeMachine coffeMachine);
    void takeTheCup(CoffeMachine coffeMachine);
    void pushTheButton(CoffeMachine coffeMachine);
}
