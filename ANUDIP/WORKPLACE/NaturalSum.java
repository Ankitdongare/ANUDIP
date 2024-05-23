import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the count of natural numbers: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive integer for the count.");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter natural number " + i + ": ");
            int num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }
            sum += num;
        }


        double average = (double) sum / count;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

    }
}
