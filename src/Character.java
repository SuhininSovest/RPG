abstract class Character {

    public Character(int hp, int power, int dexterity,
                     double experience, int gold, String name) {
        this.hp = hp;
        this.power = power;
        this.dexterity = dexterity;
        this.experience = experience;
        this.gold = gold;
        this.name = name;
    }

    public Character() {

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int hp;
    private int power;
    private int dexterity;
    private double experience;
    private int gold;
    private String name;

    public abstract void attack();
    public abstract void isDexterity();

    public abstract void lvlUP();

    public abstract void stat();

}
