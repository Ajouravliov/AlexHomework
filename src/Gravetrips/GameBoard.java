package Gravetrips;

class GameBoard {

    private char[][] board = new char[7][7];

    private int lastMoveRow;
    private int lastMoveColumn;

    public GameBoard() {
        for (int j = 0; j < 7; j++)
            for (int i = 0; i < 7; i++)
                this.board[i][j] = ' ';
    }

    private int getLastMoveRow() {
        return lastMoveRow;
    }

    private void setLastMoveRow(int lastMoveRow) {
        this.lastMoveRow = lastMoveRow;
    }

    private int getLastMoveColumn() {
        return lastMoveColumn;
    }

    private void setLastMoveColumn(int lastMoveColumn) {
        this.lastMoveColumn = lastMoveColumn;
    }

    private void findRow(int column) {
        setLastMoveColumn(column);
        setLastMoveRow(6);
        for (int i = 0; i < 7; i++) {
            if (this.board[i][getLastMoveColumn()] != ' ') {
                setLastMoveRow(--i);
                break;
            }
        }
    }

    public void putCheckerOnBoard(int column) {
        findRow(column);
        this.board[getLastMoveRow()][getLastMoveColumn()] = ' ';
    }
}
