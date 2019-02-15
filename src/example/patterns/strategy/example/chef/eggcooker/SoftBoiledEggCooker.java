package example.patterns.strategy.example.chef.eggcooker;

public class SoftBoiledEggCooker implements EggCooker{

    @Override
    public void cookEgg() {
        System.out.println("Cook soft-boiled egg!");
    }
}
