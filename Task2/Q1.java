package Task2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
        int num;
        System.out.println("Enter a num below:");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number " + num+ " is even" );
        }
        if (num % 2 != 0) {
            System.out.println("Number " + num+ " is odd" );
        }
        }
    }
}
