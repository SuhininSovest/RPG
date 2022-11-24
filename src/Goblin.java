public class Goblin extends Character{
    public Goblin(int hp, int power, int dexterity,
                  double experience, int gold, String name) {
        this.setHp(hp);
        this.setPower(power);
        this.setDexterity(dexterity);
        this.setExperience(experience);
        this.setGold(gold);
        this.setName(name);
    }
    public Goblin() {
        super();
    }

    @Override
    public void attack(Character hero) {
        System.out.println("Goblin attack");
        hero.setHp(hero.getHp() - getPower());
        System.out.println(hero.getHp());
    }

    @Override
    public void isDexterity() {

    }

    @Override
    public void lvlUP() {

    }
    @Override
    public void stat() {
        System.out.println("Monster{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                ", dexterity=" + getDexterity() +
                ", experience=" + getExperience() +
                ", gold=" + getGold() +
                ", name='" + getName() + '\'' +
                '}');
    }
}
