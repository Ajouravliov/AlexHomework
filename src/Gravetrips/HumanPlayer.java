package Gravetrips;

import java.util.Scanner;

class HumanPlayer extends Player {

    private Scanner scanner = new Scanner(System.in);

    @Override
    void makeMove() {
        System.out.println("Please, enter column number: ");
        int userInput = this.scanner.nextInt();
        setColumn(userInput);
    }
}
