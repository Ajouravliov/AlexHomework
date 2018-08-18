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

            players.get(referee.giveMove(i)).makeMove();
            gameBoard.putCheckerOnBoard(players.get(referee.giveMove(i)).getColumn());
            stopGame = referee.checkWinner(gameBoard.showLines());
        }
    }
}
