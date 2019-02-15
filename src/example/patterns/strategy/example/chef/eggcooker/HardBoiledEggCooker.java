package example.patterns.strategy.example.chef.eggcooker;

public class HardBoiledEggCooker implements EggCooker{

    @Override
    public void cookEgg() {
        System.out.println("Cook hard-boiled egg!");
    }
}
