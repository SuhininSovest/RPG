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
        System.out.println("Health " + hero.getName() + ": " + hero.getHp());
    }

    @Override
    public void isDexterity() {

    }

    @Override
    public void lvlUP(Character character) {
        setExperience(getExperience() + character.getExperience());
        if (getExperience() == 10 ) {
            setHp(getHp() + 15);
            setExperience(0);
            setDexterity(getDexterity() + 5);
            setPower(getPower() + 2);
            stat();
        } else {
            System.out.println("");
        }
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
