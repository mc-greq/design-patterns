package example.patterns.flyweight.units;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("destroyer",500, 250, 70, 10, 1000);
    private static UnitStats riflemanStats = new UnitStats("rifleman", 10, 5, 10, 5, 50);
    private static UnitStats teslaTankStats = new UnitStats("teslatank", 100, 100, 30, 15, 600);

    private UnitStatsRepository(){}

    public static UnitStats getDestroyerStats(){
        return destroyerStats;
    }

    public static UnitStats getRiflemanStats(){
        return riflemanStats;
    }

    public static UnitStats getTeslaTankStats(){
        return teslaTankStats;
    }


}
