package example.patterns.factory.abstractfactory.units;

public abstract class InfantryUnit {

    private int exp;
    private int hp;
    private int dmgDone;

    protected InfantryUnit(int exp, int hp, int dmgDone) {
        this.exp = exp;
        this.hp = hp;
        this.dmgDone = dmgDone;
    }

    public int getExp() {
        return exp;
    }

    public int getHp() {
        return hp;
    }

    public int getDmgDone() {
        return dmgDone;
    }
}
