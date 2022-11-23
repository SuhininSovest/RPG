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

    @Override
    public void attack() {

    }

    @Override
    public void isDexterity() {

    }

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
