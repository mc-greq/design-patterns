package example.patterns.factory.abstractfactory.units;

public class BlueFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType){
            case RIFLEMAN:
                return new Rifleman(0, 25, 5);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(0, 100, 25);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType unitType) {
        switch (unitType){
            case HELICOPTER:
                return new Helicopter(0, 90, 30);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
}
