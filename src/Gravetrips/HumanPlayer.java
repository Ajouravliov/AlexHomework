package Gravetrips;

import java.util.Scanner;

class HumanPlayer extends Player {

    @Override
    void makeMove() {

        System.out.println("Please, enter column number: ");

        Scanner scanner = new Scanner(System.in);
        setColumn(Integer.parseInt(scanner.nextLine()));
        scanner.close();
    }
}
