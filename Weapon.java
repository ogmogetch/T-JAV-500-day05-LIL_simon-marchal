public abstract class Weapon {
    private String name;
    private int apcost;
    private int damage;
    private boolean melee = false;

    protected Weapon(String name, int apcost, int damage, boolean melee) {
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
    }
    public void attack() {
    }
    public String getName() {
        return name;
    }

    public int getApcost() {
        return apcost;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isMelee() {
        return melee;
    }
}
