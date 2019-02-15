package example.patterns.builder.classicbuilder.house;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildDoors();
        houseBuilder.buildFloors();
        houseBuilder.buildGarage();
        houseBuilder.buildRoof();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
