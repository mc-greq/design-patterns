package example.patterns.flyweight.exercise;

import example.patterns.flyweight.exercise.pieces.*;

public class FlyweightExerciseRun {

    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPawn("Czarny Pionek",7, "a");
        ChessPiece whitePawn = new WhitePawn("Biały Pionek",2,"a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");
        //exactly same color object is used
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());
        System.out.println(blackPawn.getColor());
        System.out.println(blackQueen.getColor());
    }
}
