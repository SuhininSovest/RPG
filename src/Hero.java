public class Hero extends Character{

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
    public void attack(Character monster) {
        System.out.println("Hero attack");
        monster.setHp(monster.getHp() - getPower());
        System.out.println("Health " + monster.getName() + ": " + monster.getHp());
    }

    @Override
    public void isDexterity() {
        if (getDexterity() >= 1) {

        }
    }

    @Override
    public void lvlUP() {

    }
    @Override
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
