import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();
        String comand = "";
        System.out.println("Start game");
        System.out.println("You go down to the dungeon, hoping to earn extra money and feed your 15 children. Going down to the first floor, you decided...");

        do {
            System.out.println("battle - find the monster" + "\n" + "stat - hero statistics" + "\n" + "exit - exit");
            comand = sc.next();
            g1.games(comand);
        }while(g1.endedgame() != true);

    }

}