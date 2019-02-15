package example.patterns.singleton;

public class SingletonRun {

    public static void main(String[] args) {
        GameEngine gameEngine = GameEngine.getInstance();

        GameEngine gameEngine2 = GameEngine.getInstance();

        System.out.println(gameEngine == gameEngine2);
    }
}
