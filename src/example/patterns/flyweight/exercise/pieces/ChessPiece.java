package example.patterns.flyweight.exercise.pieces;

public abstract class ChessPiece {

    private String name;
    private int numberPosition;
    private String letterPosition;
    private Color color;

    public ChessPiece(String name, int numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()){
            case "white":
                this.color = ColorRepository.getWhite();
                break;
            default:
                this.color = ColorRepository.getBlack();
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public Color getColor() {
        return color;
    }
}
