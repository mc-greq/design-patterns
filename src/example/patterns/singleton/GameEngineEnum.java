package example.patterns.singleton;

// singleton implemented as enum protects from reflection, multithreading, serializing and classloader
public enum GameEngineEnum {

    INSTANCE("Duke");

    private int hp = 100;
    private String characterName = "";

    private GameEngineEnum(String name){
        this.characterName = name;
    }

    public void run(){
        while(true){
            // run logic of the game
        }
    }
}
