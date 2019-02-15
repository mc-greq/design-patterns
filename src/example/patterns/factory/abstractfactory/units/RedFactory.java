package example.patterns.factory.abstractfactory.units;

public class RedFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType){
            case RIFLEMAN:
                return new Rifleman(0, 20, 10);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(0, 75, 35);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType){
            case HELICOPTER:
                return new Helicopter(0, 65, 40);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
}
