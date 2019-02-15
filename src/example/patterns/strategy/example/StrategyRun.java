package example.patterns.strategy.example;

import example.patterns.strategy.example.chef.Chef;
import example.patterns.strategy.example.chef.eggcooker.HardBoiledEggCooker;
import example.patterns.strategy.example.chef.eggcooker.SoftBoiledEggCooker;

public class StrategyRun {

    public static void main(String[] args) {

        Chef chef = new Chef("Gordon Ramsay");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
