package Gravetrips;

import java.util.ArrayList;
import java.util.Scanner;

class HumanPlayer extends Player {

    private Scanner scanner = new Scanner(System.in);

    @Override
    void makeMove(ArrayList<Integer> freeColumns) {

        System.out.println("Player signed " + this.getSign() + " ,please, enter column number from 1 to 7 : ");

        boolean continueInput = true;
        int userInput;

        do {
            userInput = this.scanner.nextInt();
            for(int column:freeColumns){
                if (column == (userInput-1)){
                    continueInput = false;
                }
            }
            if (continueInput){

                System.out.println("\n Incorrect number or column is already full. Try again : ");
            }
        } while (continueInput);
        setColumn(userInput - 1);
    }
}
