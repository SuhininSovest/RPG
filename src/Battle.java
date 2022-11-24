public class Battle {
    Character moster;
    int randomMonster;
    boolean isHero = true;
    boolean isEnd = false;
    int count = 0;
    public void combat(Character hero) {
        randomMonster = (int)Math.random() * 1;
        do {
            if(randomMonster == 0) {
                moster = new Goblin(35, 1, 15, 0.0, 10, "Goblin lvl 1");
                System.out.println("You met monster " + moster.getName());
                figth(hero, moster);
            } else if (randomMonster == 1) {
                moster = new SkeletonWarrior(50, 10, 15, 0.0, 10, "Skeleton lvl 1");
                System.out.println("You met monster " + moster.getName());
                figth(hero, moster);
            } else {
                System.out.println("maybe it's a goblin");
                randomMonster = 0;
            }
        } while(true);
    }
    public void figth(Character hero, Character monster) {  // Нужно доделать логику боев в классах (методы attack)
        do {
            if (isHero == true) {
                count++;
                hero.attack();
                isHero = false;
            } else {
                count++;
                monster.attack();
                isHero = true;
            }
        } while(count != 8);
        //} while(isEnd != true);
    }
}
