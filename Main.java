import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        try {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("This number is positive.");
            } else if (number < 0) {
                System.out.println("This number is negative.");
            } else {
                System.out.println("This number is zero.");
            }

        } catch (InputMismatchException e) {
            System.out.println("This is not a number. Please check it.");
        }

        scanner.close();
    }
}
