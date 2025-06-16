package level_1;
import java.util.Scanner;


public class FactorialFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        }
        else {
            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
                }
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

	}

}
