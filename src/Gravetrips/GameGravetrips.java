package Gravetrips;

import java.util.ArrayList;


public class GameGravetrips {

    public static void main(String[] args) {


        GameBoard gameBoard = new GameBoard();
        Referee referee = new Referee();
        ArrayList<Player> players = new ArrayList<>();
        boolean stopGame = false;

        players = referee.setPlayers(players);

        for (int i = 0; (i < 49) && (!stopGame); i++) {
            int whoseTurn = referee.giveMove(i);
            players.get(whoseTurn).makeMove();
            gameBoard.putCheckerOnBoard(players.get(whoseTurn).getColumn(), players.get(whoseTurn).getSign());
            stopGame = referee.checkWinner(gameBoard.showLines());
        }

        if (!stopGame) {
            System.out.print("\n Nobody wins");
        }
    }
}
