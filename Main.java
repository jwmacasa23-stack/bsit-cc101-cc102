import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[12];
        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score of Player " + (i + 1) + ": ");
            scores[i] = input.nextInt();

            while (scores[i] < 0) {
                System.out.print("Invalid score. Enter a nonnegative score: ");
                scores[i] = input.nextInt();
            }

            total += scores[i];
        }

        double average = (double) total / scores.length;

        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        Arrays.sort(scores);

        System.out.println("\nTotal Points: " + total);
        System.out.println("Average Points: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);

        System.out.println("Scores in Descending Order:");

        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println(scores[i]);
        }

        input.close();
    }
}
