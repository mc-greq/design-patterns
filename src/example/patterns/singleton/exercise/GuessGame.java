package example.patterns.singleton.exercise;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessGame {

    private int score;
    private static GuessGame instance;

    private GuessGame(){

    }

    public static GuessGame getInstance(){
        if(instance == null){
            synchronized (GuessGame.class){
                if(instance == null){
                    instance = new GuessGame();
                }
            }
        }

        return instance;
    }

    public void play(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Try to guess a number! Range 0-9");

        for(int i = 0; i < 10; i++){
            int numberToGuess = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println("\nRound " + (i + 1) + "!");
            if(numberToGuess == scanner.nextInt()){
                System.out.println("Good guess!");
                score++;
            }else {
                System.out.println("Wrong the number was " + numberToGuess + ", better luck next time!");
            }
        }
        System.out.println("Your score is: " + score);
    }

    public int getScore() {
        return score;
    }
}
