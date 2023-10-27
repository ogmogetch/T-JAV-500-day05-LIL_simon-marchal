public class Monster extends Unit{

    protected int damage;
    protected int apcost;


    public Monster(String name, int hp, int damage) {
        super(name, hp);
        this.damage = 0;
        this.apcost = 0;
    }

    public boolean equip(String weapon) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    public boolean attack(Fighter fighter){
        if (this.getAp() < this.apcost) {
            System.out.println(this.getName() + " is too far away from " + fighter.getName());
            return false;
        }
        if (this.moveCloseTo(fighter) == false) {
            return false;
        }
        this.setAp(this.getAp() - this.apcost);
        fighter.receiveDamage(this.damage);
        return true;
    }

    public int getApcost() {
        return apcost;
    }
    public int getDamage() {
        return damage;
    }

}
