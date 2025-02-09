
import java.util.Scanner;

public class TaskQ1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Temparature in Fahrenheit ");
            double Fahrenheit = scanner.nextDouble();
            double celcius = (Fahrenheit - 32 )* 5/9;
            System.out.println("Temperature in Celcius is: " + celcius);
        }
    }
}
