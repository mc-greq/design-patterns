package example.patterns.factory.abstractfactory.units;

public abstract class MechanizedUnit {

    private int exp;
    private int hp;
    private int dmgDone;

    protected MechanizedUnit(int exp, int hp, int dmgDone) {
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
