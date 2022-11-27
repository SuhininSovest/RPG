public class Hero extends Character{
    int count = 1;

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
    public void lvlUP(Character monster) {
        setExperience(getExperience() + monster.getExperience());
        if (getExperience() == 10 * (count * 2)) {
            count++;
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("LVL UP");
            System.out.println("You have become stronger and faster!");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            setHp(getHp() + 25);
            setExperience(0);
            setName("Artem lvl " + count);
            setDexterity(getDexterity() + 5);
            setPower(getPower() + 5);
            stat();
        } else {
            System.out.println("");
        }
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
