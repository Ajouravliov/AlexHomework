import java.util.Scanner;

public class AmountEvenOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int evenNumbers = 0, oddNumbers = 0, inputNumber;

        System.out.println("INSERT NUMBERS TO FIND AMOUNT OF EVEN AND ODD NUMBERS (TO STOP THE GAME INSERT ZERO)");

        System.out.println("Insert number and press ENTER: ");
        inputNumber = Integer.parseInt(scanner.nextLine());

        while (inputNumber != 0) {

            if (inputNumber % 2 == 0) {

                evenNumbers++;
            } else {

                oddNumbers++;
            }

            System.out.println("Insert number and press ENTER: ");
            inputNumber = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("GAME  OVER , YOU ENTERED  " + evenNumbers + " EVEN  AND " + oddNumbers + " ODD NUMBERS");

        scanner.close();
    }
}
