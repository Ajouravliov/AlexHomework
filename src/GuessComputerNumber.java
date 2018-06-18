import java.util.Random;
import java.util.Scanner;

public class GuessComputerNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int computerNumber, inputNumber, startRange = 1, endRange = 100;

        boolean stopFlag = true;

        System.out.println ("GUESS YOUR OWN NUMBER FROM 1 TO 100 (TO ABORT THE GAME INSERT ZERO)");

        computerNumber = random.nextInt((endRange - startRange) + 1) + startRange;


        do {

            System.out.println ("IS YOUR NUMBER " + computerNumber + " ? (PRESS 1 IF IT LESS, PRESS 2 IF IT GREATER, PRESS 3 IF IT EQUAL )");
            inputNumber = Integer.parseInt(scanner.nextLine());

            if (inputNumber ==1) {

                endRange = computerNumber;
                computerNumber = random.nextInt((endRange - startRange) + 1) + startRange;
            }

            if (inputNumber == 2) {

                startRange = computerNumber;
                computerNumber = random.nextInt((endRange - startRange) + 1) + startRange;
            }

            if ((inputNumber == 3) || (inputNumber == 0) ) {

                stopFlag = false;
            }
        }
        while (stopFlag) ;

        if (inputNumber == 0) {

            System.out.println("GAME  ABORTED !");

        } else {

            System.out.println("COMPUTER WINS !");
        }

        scanner.close();
    }
}
