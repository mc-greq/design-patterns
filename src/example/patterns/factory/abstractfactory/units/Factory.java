package example.patterns.factory.abstractfactory.units;

import example.patterns.factory.abstractfactory.units.InfantryUnit;
import example.patterns.factory.abstractfactory.units.UnitType;

public abstract class Factory {

    public abstract InfantryUnit createInfantryUnit(UnitType unitType);
    public abstract MechanizedUnit createMechanizedUnit(UnitType unitType);
    public abstract AirUnit createAirUnit(UnitType unitType);
}
