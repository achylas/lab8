import java.util.Scanner;

public class TaskQ4 {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the minutes  :");
        long min = sc.nextLong();
        long year = min/525600 ;
        long days = (min%525600)/1440;
        System.out.println(min+ "minutes is equal to: " + year + "years "+ days +" days");
    }
}
}
