public class Hero extends Character{
    public Goblin monster;
    public Hero(int hp, int power, int dexterity,
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
        monster.setHp(monster.getHp() - getPower());
        if (monster.getHp() <= 0) {
            setGold(getGold() + monster.getGold());
            System.out.println("Hero won!");
            System.out.println("After searching the body of the defeated " + monster.getName() + ", you found gold." + getGold());
        } else {
            System.out.println("The hero struck an insidious blow to the balls.");
        }
    }

    @Override
    public void isDexterity() {
        if (getDexterity() >= 1) {

        }
    }

    public void stat() {
        System.out.println("Hero{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                ", dexterity=" + getDexterity() +
                ", experience=" + getExperience() +
                ", gold=" + getGold() +
                ", name='" + getName() + '\'' +
                '}');
    }

}
