package Gravetrips;

abstract class Player {

    private int column;
    private String sign;

    String getSign() {
        return sign;
    }

    void setSign(Sign sign) {
        this.sign = sign.toString();
    }

    int getColumn() {

        return column;
    }

    void setColumn(int column) {
        this.column = column;
    }

    abstract void makeMove();
}
