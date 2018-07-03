import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber, inputNumber;

        System.out.println("INSERT  NUMBERS TO FIND A GREATEST (TO STOP THE GAME INSERT ZERO)");

        System.out.println("Insert number and press ENTER: ");
        inputNumber = Integer.parseInt(scanner.nextLine());
        maxNumber = inputNumber;

        while ((maxNumber != 0) && (inputNumber != 0)) {

            System.out.println("Insert number and press ENTER: ");
            inputNumber = Integer.parseInt(scanner.nextLine());

            if (inputNumber > maxNumber) {

                maxNumber = inputNumber;
            }
        }

        System.out.println("GAME  OVER , THE GREATEST ENTERED NUMBER IS: " + maxNumber);

        scanner.close();
    }
}