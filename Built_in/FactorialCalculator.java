package Built_In;
import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = getInput();
        long result = calculateFactorial(number);
        displayResult(number, result);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
