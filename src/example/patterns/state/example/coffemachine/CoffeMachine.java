package example.patterns.state.example.coffemachine;

public class CoffeMachine {

    private State state;

    public CoffeMachine() {
        this.state = new NoCoinState();
    }

    public void insertCoin(){
        state.insertCoin(this);
    }

    public void pushTheButton(){
        state.pushTheButton(this);
    }

    public void takeTheCup(){
        state.takeTheCup(this);
    }

    public void returnTheCoin(){
        state.returnTheCoin(this);
    }

    void setState(State state) {
        this.state = state;
    }
}
