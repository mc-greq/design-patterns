package example.patterns.factory.simplefactory.units;

public abstract class Unit {

    private int exp;
    private int hp;
    private int dmgDone;

    protected Unit(int exp, int hp, int dmgDone) {
        this.exp = exp;
        this.hp = hp;
        this.dmgDone = dmgDone;
    }
}
