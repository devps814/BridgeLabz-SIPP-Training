package level_1;
import java.util.Scanner;


public class PowerCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int number = sc.nextInt();
	     int power = sc.nextInt();
	     int result = 1;
	     
	     for (int i = 1; i <= power; i++) {
	    	 result *= number;
	    	 }
	     System.out.println(number + " raised to the power of " + power + " is: " + result);

	}

}
