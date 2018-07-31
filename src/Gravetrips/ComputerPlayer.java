package Gravetrips;

import java.util.Random;

class ComputerPlayer extends Player {

    @Override
    void makeMove() {

        Random random = new Random();
        setColumn(random.nextInt(8));
    }
}
