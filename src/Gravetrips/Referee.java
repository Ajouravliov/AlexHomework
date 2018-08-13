package Gravetrips;

import java.util.ArrayList;

class Referee {

    private boolean win;


    private boolean getWin() {
        return win;
    }

    private void setWin(boolean win) {
        this.win = win;
    }

    public boolean checkWinner(ArrayList<String> lines) {

        setWin(false);
        for(String row:lines){

           if((row.contains("xxxx")) || (row.contains("oooo"))){
              setWin (true);
           }
        }

        return getWin();
    }

    public char giveMove (int turnNumber){

        if ((turnNumber%2) ==1){
            return 'x';
        } else {

            return 'o';
        }
    }

    public boolean isItLastMove(int turnNumber) {
        return turnNumber == 49;
    }
}
