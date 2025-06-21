package Built_In;
import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();

        // Generate and display the sequence
        generateFibonacci(terms);

        scanner.close();
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // for newline
    }
}
