import java.util.Arrays;
import java.util.Random;

public class GreaterThanAverage {

    public static void main(String[] args) {

        int length = 10, sum = 0, average;

        int[] numbers = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(100);
            sum = sum + numbers[i];
        }

        System.out.println("Here is an array : " + Arrays.toString(numbers));

        average = sum / length;
        System.out.println("Average of array is " + average);
        System.out.println("Here are the numbers greater than average : ");

        for (int i = 0; i < length; i++) {
            if (numbers[i] > average) {
                System.out.println(numbers[i]);
            }
        }
    }
}
