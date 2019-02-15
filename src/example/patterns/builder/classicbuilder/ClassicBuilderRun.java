package example.patterns.builder.classicbuilder;

import example.patterns.builder.classicbuilder.house.BigHouseBuilder;
import example.patterns.builder.classicbuilder.house.House;
import example.patterns.builder.classicbuilder.house.HouseDirector;
import example.patterns.builder.classicbuilder.house.SmallHouseBuilder;

public class ClassicBuilderRun {

    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
