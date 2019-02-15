package example.patterns.builder.innerclass;

import example.patterns.builder.innerclass.house.House;

public class BuilderRun {

    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildDoors("doors")
                .build();

        System.out.println(house);

    }
}
