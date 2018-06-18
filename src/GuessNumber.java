import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int computerNumber = new Random().nextInt(100) + 1;

        int inputNumber, attemptsAmount = 0;

        boolean stopFlag = true;

        System.out.println ("GUESS A COMPUTER-DESIGNED NUMBER FROM 1 TO 100 (TO ABORT THE GAME INSERT ZERO)");


        do {

            System.out.println("Insert number and press ENTER: ");
            inputNumber = Integer.parseInt(scanner.nextLine());

            if (inputNumber == 0) {

                stopFlag = false;

            }  else
                    if (inputNumber == computerNumber) {

                        System.out.println ("BINGO !!!");
                        attemptsAmount ++;
                        stopFlag = false;
                    } else
                            if (inputNumber > computerNumber) {

                                System.out.println ("Inserted number is greater than computer-designed !");
                                attemptsAmount ++;
                            } else
                                  if (inputNumber < computerNumber) {

                                      System.out.println ("Inserted number is less than computer-designed !");
                                      attemptsAmount ++;
                            }
        }
        while (stopFlag) ;

        if (inputNumber == 0) {

            System.out.println("GAME  ABORTED ! YOU MADE " + attemptsAmount + " ATTEMPTS AND DID NOT GUESS THE NUMBER");

        } else {

            System.out.println("EXCELLENT ! YOU MADE " + attemptsAmount + " ATTEMPTS AND WIN");
        }

        scanner.close();
    }
}
