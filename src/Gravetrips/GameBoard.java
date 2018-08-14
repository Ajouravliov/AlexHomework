package Gravetrips;

import java.util.ArrayList;

class GameBoard {

    private char[][] board = new char[7][7];

    private int lastMoveRow;
    private int lastMoveColumn;

    GameBoard() {
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
        for (int i = 0; i < 7; i++) {
            if (this.board[i][getLastMoveColumn()] == 'x') {
                setLastMoveRow(--i);
                break;
            }
        }
    }

    void putCheckerOnBoard(int column) {
        findRow(column);
        System.out.println("Row:" + getLastMoveRow() + "  Column: " +getLastMoveColumn());
        this.board[getLastMoveRow()][getLastMoveColumn()] = 'x';
    }

    ArrayList<String> showLines() {
        ArrayList<String> lines = new ArrayList<>();

        lines.add(getHorizontalLine(getLastMoveRow()));
        lines.add(getVerticalLine(getLastMoveColumn()));
        lines.add(getRightSlantLine(getLastMoveRow(), getLastMoveColumn()));
        lines.add(getLeftSlantLine(getLastMoveRow(), getLastMoveColumn()));

        return lines;
    }

    private String getHorizontalLine(int lastMoveRow) {
        String horizontalLine = "";
        for (int i = 0; i < 7; i++) {
            horizontalLine += this.board[lastMoveRow][i];
        }
        return horizontalLine;
    }

    private String getVerticalLine(int lastMoveColumn) {
        String verticalLine = "";
        for (int i = 0; i < 7; i++) {
            verticalLine += this.board[i][lastMoveColumn];
        }
        return verticalLine;
    }

    private String getRightSlantLine(int lastMoveRow, int lastMoveColumn) {
        String rightSlantLine = "";
        int startRow, startColumn;
        if (lastMoveRow > lastMoveColumn) {
            startRow = lastMoveRow - lastMoveColumn;
            startColumn = 0;
        } else {

            startColumn = lastMoveColumn - lastMoveRow;
            startRow = 0;
        }
        while ((startRow < 7) && (startColumn <= 0)) {
            rightSlantLine += this.board[startRow][startColumn];
            startRow++;
            startColumn--;
        }
        return rightSlantLine;
    }

    private String getLeftSlantLine(int lastMoveRow, int lastMoveColumn) {
        String leftSlantLine = "";
        int startRow, startColumn;
        if (lastMoveRow > lastMoveColumn) {
            startRow = lastMoveRow - lastMoveColumn;
            startColumn = 0;
        } else {
            startColumn = lastMoveColumn - lastMoveRow;
            startRow = 0;
        }
        while ((startRow < 7) && (startColumn < 7)) {
            leftSlantLine += this.board[startRow][startColumn];
            startRow++;
            startColumn++;
        }
        return leftSlantLine;
    }
}