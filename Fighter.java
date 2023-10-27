public interface Fighter {
    public boolean equip(String weapon);
    public boolean attack(Fighter fighter);

    public void receiveDamage(int damage);
    public boolean moveCloseTo(Fighter fighter);
    public void recoverAP();
    public String getName();
    public int getAP();
    public int getHP();

}

