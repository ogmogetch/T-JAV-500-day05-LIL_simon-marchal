public abstract class Unit implements Fighter {
    private String name;
    private int ap;
    private int hp;
    protected Fighter closeTo = null;

    public Unit(String name, int ap, int hp) {
        this.name = name;
        this.ap = ap;
        this.hp = hp;
    }

    protected Unit() {
    }


    @Override
    public void receiveDamage(int damage) {
        if (damage < 1) {
            return;
        }
        if (damage >= this.hp) {
            this.hp = 0;
        } else {
            this.hp -= damage;
        }
    }
    public boolean moveCloseTo(Fighter fighter) {
        if (fighter == null) {
            return false;
        }
        if (this.closeTo == fighter) {
            return true;
        }
        if (this.ap < 1) {
            return false;
        }
        this.ap -= 1;
        this.closeTo = fighter;
        return true;
    }

    public void recoverAP() {
        this.ap += 7;
        if (this.ap > 50) {
            this.ap = 50;
        }
    }

    public String getName() {
        return name;
    }

    public int getAp() {
        return ap;
    }

    public int getHp() {
        return hp;
    }

    public abstract boolean equip(Weapon weapon);
}
