package Gravetrips;

abstract class Player {

    private int column;

    int getColumn() {
        return column;
    }

    void setColumn(int column) {
        this.column = column;
    }

    abstract void makeMove();
}
