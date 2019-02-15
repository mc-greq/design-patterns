package example.patterns.factory.simplefactory;

import example.patterns.factory.simplefactory.units.Factory;
import example.patterns.factory.simplefactory.units.UnitFactory;
import example.patterns.factory.simplefactory.units.Unit;
import example.patterns.factory.simplefactory.units.UnitType;

public class WargameRun {

    public static void main(String[] args) {

        Factory unitFactory = new UnitFactory();

        Unit tank = unitFactory.createUnit(UnitType.TANK);
        Unit rifleman = unitFactory.createUnit(UnitType.RIFLEMAN);
    }
}
