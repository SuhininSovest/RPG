import java.util.Scanner;

public class Battle {
    Character moster;
    int randomMonster;
    boolean isEnd = false;
    String commands = "";
    Scanner sc = new Scanner(System.in);
    public void combat(Character hero) {  //Определение кол-во проиивников и сам кто противник героя.
        randomMonster = (int)Math.random() * 1;
        do {
            if(randomMonster == 0) {
                moster = new Goblin(35, 10, 15, 20.0, 10, "Goblin lvl 1");
                System.out.println("You met monster " + moster.getName());
                figth(hero, moster);
            } else if (randomMonster == 1) {
                moster = new SkeletonWarrior(50, 10, 15, 30.0, 10, "Skeleton lvl 1");
                System.out.println("You met monster " + moster.getName());
                figth(hero, moster);
            } else {
                System.out.println("maybe it's a goblin");
                moster = new Goblin(35, 10, 15, 20.0, 10, "Goblin lvl 1");
                figth(hero, moster);
            }
            isEnd = true;
        } while(isEnd != true);
    }
    public void figth(Character hero, Character monster) {  // Нужно доделать логику боев в классах (методы attack)
        System.out.println("...................................................");
        System.out.println("attack - attack the monster" + "\n" + "stat - take a closer look at the monster" + "\n" + "exit - escape from the dungeon");
        System.out.println("...................................................");
        do {
            commands = sc.next();
            System.out.println("...................................................");
            System.out.println("attack - attack the monster" + "\n" + "stat - take a closer look at the monster" + "\n" + "exit - escape from the dungeon");
            System.out.println("...................................................");
            if (commands.equals("attack")) { //логика атаки
                if (hero.getHp() > 0 && monster.getHp() > 0) {
                    hero.attack(monster);
                    if(moster.getHp() - hero.getPower() <= 0) {
                        System.out.println("The " + monster.getName() + " is dead");
                        System.out.println("You managed to find some gold: " + monster.getGold() + " and take the experience out of the battle! You are definitely getting better!");
                        hero.setGold(hero.getGold() + monster.getGold());
                        hero.lvlUP(moster);
                        isEnd = true;
                    } else {
                        monster.attack(hero);
                    }
                } else {
                    System.out.println("The fight continues!");
                }
            } else if(commands.equals("exit")) {
                isEnd = true;
            } else if(commands.equals("stat")) {
                moster.stat();
            } else {
                System.out.println("I don't understand you. Please repeat the command.");
            }
        } while(isEnd != true);
    }
}
