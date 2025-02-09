package Task2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("This program is to cheak the eligibiity for vote");
        try(Scanner sc =new Scanner(System.in)){
            System.out.println("Enter your age below");
            int age= sc.nextInt();
                if (age >=18) {
                    System.out.println("Your are eligible for vote");
                    } else{
                        System.out.println("You are not eligible for vote");
                    }

        }
    }
}
