package Task2;

import java.util.Scanner;

public class q7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.println("Enter a positive integer (or a negative number to exit):");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            }
        } while (number >= 0);

        System.out.println("Sum of all positive integers entered: " + sum);

        scanner.close();
    }
}
