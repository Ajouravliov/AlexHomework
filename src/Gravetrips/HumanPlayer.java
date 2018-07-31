package Gravetrips;

import java.util.Scanner;

class HumanPlayer extends Player {

    @Override
    void makeMove() {

        Scanner scanner = new Scanner(System.in);
        setColumn(Integer.parseInt(scanner.nextLine()));
        scanner.close();
    }
}
