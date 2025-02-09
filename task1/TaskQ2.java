import java.util.Scanner;

public class TaskQ2 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the inches :");
        double inches = sc.nextDouble();
        double meter = inches *0.0254;
        System.out.println(inches + " inches is equal to:" + meter+" meters");
    }
}
}
