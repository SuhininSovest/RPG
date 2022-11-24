public class SkeletonWarrior extends Character{
    @Override
    public void attack() {

    }

    @Override
    public void isDexterity() {

    }

    @Override
    public void lvlUP() {

    }

    @Override
    public void stat() {
        System.out.println("Skeleton{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                ", dexterity=" + getDexterity() +
                ", experience=" + getExperience() +
                ", gold=" + getGold() +
                ", name='" + getName() + '\'' +
                '}');
    }
    public SkeletonWarrior(int hp, int power, int dexterity,
                  double experience, int gold, String name) {
        this.setHp(hp);
        this.setPower(power);
        this.setDexterity(dexterity);
        this.setExperience(experience);
        this.setGold(gold);
        this.setName(name);
    }
}
