package Gravetrips;

public class GameGravetrips {

    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        ComputerPlayer firstPlayer = new ComputerPlayer();
        ComputerPlayer secondPlayer = new ComputerPlayer();
        Referee referee = new Referee();
        int turnNumber = 0;
        boolean stopGame = false;

        do {
            turnNumber++;
            if (referee.giveMove(turnNumber) == 'x') {
                firstPlayer.makeMove();
                gameBoard.putCheckerOnBoard(firstPlayer.getColumn());
            } else {
                secondPlayer.makeMove();
                gameBoard.putCheckerOnBoard(secondPlayer.getColumn());
            }
            stopGame = referee.checkWinner(gameBoard.showLines());



            if(stopGame){

                System.out.println("Winner!");
            }

            System.out.println("it was " + turnNumber + "turns");


        } while ((!referee.isItLastMove(turnNumber)) && (!stopGame));



    }
}
