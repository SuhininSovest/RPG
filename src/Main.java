import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Character h = new Hero(100, 10, 69, 15.0, 540, "Artem lvl 1");

        Scanner sc = new Scanner(System.in);
        boolean isFinish = false;
        String commands = "";  // Считывает команды игрока
        System.out.println("Start game");
        System.out.println("You go down to the dungeon, hoping to earn extra money and feed your 15 children. Going down to the first floor, you decided...");
        System.out.println("battle - find the monster" + "\n" + "stat - hero statistics" + "\n" + "exit - exit");
        do {
            commands = sc.next();
            if (commands.equals("stat")) {
                h.stat();
            } else if(commands.equals("battle")) {
                battle.combat(h);
                System.out.println("attack - attack the monster" + "\n" + "stat - take a closer look at the monster" + "\n" + "exit - escape from the dungeon");

            } else if(commands.equals("exit")) {
                isFinish = true;
            } else {
                System.out.println("I don't understand you. Please repeat the command.");
            }
        } while(isFinish != true);
        System.out.println("Bye, " + h.getName());
    }

}