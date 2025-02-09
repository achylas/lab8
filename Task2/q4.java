package Task2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the traffic light color (1 for Red, 2 for Yellow, 3 for Green):");
        int color = scanner.nextInt();

        switch (color) {
            case 1:
                System.out.println("Red: Stop");
                break;
            case 2:
                System.out.println("Yellow: Get Ready");
                break;
            case 3:
                System.out.println("Green: Go");
                break;
            default:
                System.out.println("Invalid traffic light color!");
        }

        scanner.close();
    }
}