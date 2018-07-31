package Gravetrips;

class GameBoard {

    private char[][] board = new char[7][7];

    public GameBoard() {

        for (int j = 0; j < 7; j++)
            for (int i = 0; i < 7; i++)
                this.board[i][j] = ' ';
    }
}
