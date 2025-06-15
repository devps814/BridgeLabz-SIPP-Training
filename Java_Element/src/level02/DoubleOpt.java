package level02;
import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 double da = sc.nextDouble();
	     double db = sc.nextDouble();
	     double dc = sc.nextDouble();
	     double result1 = da + db * dc;
	     double result2 = da * db + dc;
	     double result3 = dc + da / db;
	     double result4 = da % db + dc;
	     System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

	}

}
