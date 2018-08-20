package Gravetrips;

import java.util.ArrayList;
import java.util.Random;

class ComputerPlayer extends Player {

    @Override
    void makeMove(ArrayList<Integer> freeColumns) {

        Random random = new Random();
        setColumn(freeColumns.get(random.nextInt(freeColumns.size())));
        System.out.println("Player signed " + this.getSign() + " chose column number " + (getColumn() + 1));
    }
}
