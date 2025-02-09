import java.util.Scanner;

public class TaskQ3 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the Meters :");
        double meters = sc.nextDouble();
        double km = meters / 1000;
        System.out.println(meters  + " meters  is equal to:" + km +" kilometers");
    }
}
}
