package example.patterns.singleton;

import java.io.Serializable;

// when singleton is deserialized it may create many copies of oneself
// implementing readResolve method as is show below defends from this scenario
public class GameEngine implements Serializable {

    // we want this class to be one and only one during life of application

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance;

    private GameEngine(){

    }

    // Making it thread safe:
    // 1. making whole method synchronized
    // 2. synchronizing inside method - better option as implemented below
    // 3. static GameEngine field can be instantiated right at the top as:
    //      private static GameEngine instance = new GameEngine(); - it will be created on classloader
    public static GameEngine getInstance(){
        if(instance == null){
            synchronized (GameEngine.class) {
                if(instance == null) {
                    instance = new GameEngine();
                }
            }
        }

        return instance;
    }

    public void run(){
        while (true){
            // waiting for player input
            // changing state
            // rendering graphics
        }
    }

    protected Object readResolve(){
        return getInstance();
    }
}
