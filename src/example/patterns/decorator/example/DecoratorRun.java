package example.patterns.decorator.example;

public class DecoratorRun {

    public static void main(String[] args) {
        generateMap();
    }

    public static void generateMap(){
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new SwampDecorator(new ForrestDecorator(new Plain()));
        Terrain terrain4 = new RoadDecorator(new Hill());

        System.out.println("Plain fuel cost: " + terrain.fuelCost());
        System.out.println("Hill fuel cost: " + terrain1.fuelCost());
        System.out.println("SwampDecorator hill cost: " + terrain2.fuelCost());
        System.out.println("SwampDecorator forrest plain cost: " + terrain3.fuelCost());
        System.out.println(terrain4.getDescription() + " " + terrain4.fuelCost());
    }
}
