import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
      System.out.println("demo");
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter your name ");
        String name = sc.nextLine();
        System.out.println("my name is "+name);
      }
  }

}