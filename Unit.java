public abstract class Unit implements Fighter {
    private String name;
    private int ap;
    private int hp;

    public Unit(String name, int ap, int hp) {
        this.name = name;
        this.ap = ap;
        this.hp = hp;
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
        if (fighter == this) {
            return false;
        }
        System.out.println(name + " is moving closer to " + fighter.getName());
        return true;
    }

    public void recoverAP() {
        ap += 7;
        if (ap > 50) {
            ap = 50;
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

}
