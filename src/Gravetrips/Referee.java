package Gravetrips;

import java.util.ArrayList;
import java.util.Scanner;

enum Sign {

    X("X"),
    O("O");

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

    ArrayList<Player> setPlayers( ArrayList<Player> players) {

        ArrayList<Sign> signs = new ArrayList<>();
        signs.add(Sign.X);
        signs.add(Sign.O);
        for (int i = 0; i < 2; i++) {
            System.out.println("Select player number " + i + " :");
            System.out.println("Computer - press 1, Human - press 2");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 1) {
                ComputerPlayer computer = new ComputerPlayer();
                computer.setSign(signs.get(i));
                players.add(computer);
            } else if (select == 2) {
                HumanPlayer human = new HumanPlayer();
                human.setSign(signs.get(i));
                players.add(human);
            } else {
                System.out.println("Wrong choise ! Once again, please !");
                i--;
            }
            scanner.close();
        }
        return players;
    }

    boolean checkWinner(ArrayList<String> lines) {
        setWin(false);
        for (String row : lines) {

            if ((row.contains("xxxx")) || (row.contains("oooo"))) {
                setWin(true);
            }
        }
        return getWin();
    }

    int giveMove(int turnNumber) {
       return turnNumber % 2;
    }
}
