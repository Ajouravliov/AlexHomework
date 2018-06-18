import java.util.Scanner;

public class ThreeNumbers {


        public static void main (String [] args) {

            Scanner scanner = new Scanner (System.in);


            System.out.println ("INSERT  THREE  NUMBERS TO FIND A GREATEST");

            System.out.println ("Insert number A and press ENTER: ");
            int numberA = Integer.parseInt (scanner.nextLine());

            System.out.println ("Insert number B and press ENTER: ");
            int numberB = Integer.parseInt (scanner.nextLine());

            System.out.println ("Insert number C and press ENTER: ");
            int numberC = Integer.parseInt (scanner.nextLine());

            System.out.println ("HERE  IS  THE  RESULT : ");


            if ((numberA > numberB) && (numberA > numberC)) {
                System.out.println ("Number A is greater than B and C");
            }
            else
                if ((numberB > numberA) && (numberB > numberC)) {
                    System.out.println ("Number B is greater than A and C");
                }
                else
                    if ((numberC > numberA) && (numberC > numberB)) {
                        System.out.println ("Number C is greater than A and B");
                    }
                        else
                            if ((numberA == numberB) && (numberA > numberC)) {
                                System.out.println ("Numbers A, B are equal and greater than C");
                            }
                                else
                                    if ((numberA == numberC) && (numberA > numberB)) {
                                        System.out.println ("Numbers A, C are equal and greater than B");
                                    }
                                    else
                                        if ((numberB == numberC) && (numberB > numberA)) {
                                            System.out.println("Numbers B, C are equal and greater than A");
                                        }
                                        else
                                              System.out.println ("Numbers A, B, C are equal");

            scanner.close();
        }
}
