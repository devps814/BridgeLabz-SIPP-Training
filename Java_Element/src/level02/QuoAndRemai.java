package level02;
import java.util.Scanner;
public class QuoAndRemai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int quotient = n1 / n2;
        int remainder = n1 % n2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + n1 + " and " + n2);
	}

}
