import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Multiplication table of " + n + ":");

        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " * " + i + " = " + product);
        }

        scanner.close();
    }
}
