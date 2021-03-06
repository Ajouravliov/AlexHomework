package Gravetrips;

import java.util.ArrayList;
import java.util.Scanner;

enum Sign {

    X("X"),
    O("O"),
    EMPTY("."),
    XXXX("XXXX"),
    OOOO("OOOO");

    private String value;

    Sign(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

class Referee {

    private boolean win;

    private boolean getWin() {
        return win;
    }

    private void setWin(boolean win) {
        this.win = win;
    }

    ArrayList<Player> setPlayers(ArrayList<Player> players) {

        ArrayList<Sign> signs = new ArrayList<>();
        signs.add(Sign.X);
        signs.add(Sign.O);

        Scanner scanner = new Scanner(System.in);
        int select;

        for (int i = 0; i < 2; i++) {
            System.out.println("Select player number " + (i + 1) + " signed as " + signs.get(i) + " :");
            System.out.println("Computer - press 1, Human - press 2");
            select = Integer.parseInt(scanner.nextLine());
            if (select == 1) {
                ComputerPlayer computer = new ComputerPlayer();
                computer.setSign(signs.get(i));
                players.add(computer);
            } else if (select == 2) {
                HumanPlayer human = new HumanPlayer();
                human.setSign(signs.get(i));
                players.add(human);
            } else {
                System.out.println("\n Wrong choice ! Once again, please ! \n");
                i--;
            }
        }
        return players;
    }

    boolean checkWinner(ArrayList<String> lines) {
        setWin(false);
        for (String row : lines) {
            if (row.contains(Sign.XXXX.toString())) {
                setWin(true);
                System.out.println("\n Player signed as " + Sign.X.toString() + " wins! \n");

            } else if (row.contains(Sign.OOOO.toString())) {
                setWin(true);
                System.out.println("\n Player signed as " + Sign.O.toString() + " wins! \n");
            }
        }
        return getWin();
    }

    int giveMove(int turnNumber) {
        return turnNumber % 2;
    }
}
