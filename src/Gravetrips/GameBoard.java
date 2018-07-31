package Gravetrips;

class GameBoard {

    private char[][] board = new char[7][7];

    public GameBoard() {

        for (int j = 0; j < 7; j++)
            for (int i = 0; i < 7; i++)
                this.board[i][j] = ' ';
    }

    private int findLine(int column) {

        int i = 0;
        while ((this.board[i][column] == ' ') && (i < 7)) {

        }
        return 0;
    }

    public void putCheckerOnBoard(int column) {

        this.board[findLine(column)][column] = ' ';
    }

}
