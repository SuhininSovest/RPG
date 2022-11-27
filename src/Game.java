public class Game {
    boolean isFinish = false;
    boolean isEndTurn = false;
    Character h = new Hero(100, 15, 69, 0.0, 540, "Artem lvl 1");
    Battle battle = new Battle();
    public void games(String commands) {
        do {
            if (commands.equals("stat")) {
                h.stat();
                isEndTurn = true;
            } else if(commands.equals("battle")) {
                battle.combat(h);
                isEndTurn = true;
            } else if(commands.equals("exit")) {
                isEndTurn = true;
                isFinish = true;
                System.out.println("Bye, " + h.getName());
            } else {
                System.out.println("I don't understand you. Please repeat the command.");
            }
        } while(isEndTurn != true);
    }
    public boolean endedgame() {
        if (isFinish != true) {
            return false;
        } else {
            return true;
        }

    }
}
