package Gravetrips;

import java.util.Random;

class ComputerPlayer extends Player {

    @Override
    void makeMove() {

        Random random = new Random();
        setColumn(random.nextInt(7));
        System.out.println("move :" + getColumn());
    }
}
