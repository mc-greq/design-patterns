package example.patterns.decorator.example;

abstract public class Terrain {

    private String description;
    private int fuelCost;

    public Terrain(String description, int fuelCost) {
        this.description = description;
        this.fuelCost = fuelCost;
    }

    public int fuelCost(){
        return this.fuelCost;
    }

    public String getDescription() {
        return description;
    }
}
