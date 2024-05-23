import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        while (number < 0) {
            System.out.print("Invalid input. Please enter a positive integer: ");
            number = scanner.nextInt();
        }

        long factorial = 1;
        int i = number;
        while (i > 0) {
            factorial *= i;
            i--;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);

    }
}
