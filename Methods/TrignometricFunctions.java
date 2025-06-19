package Methods;
import java.util.*;

public class TrignometricFunctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double angle = sc.nextDouble();
		double[] TrigoValues = calculateTrignometricFunctions(angle);
		System.out.printf("Sine value of " + angle + " is : " + TrigoValues[0]+ "\n");
		System.out.printf("Cosine value of " + angle + " is : " + TrigoValues[1] + "\n");
		System.out.printf("Tan value of " + angle + " is  :" + TrigoValues[2] + "\n");
		
	}
	public static double[] calculateTrignometricFunctions(double angle) {
		double radians = Math.toRadians(angle);
		double[] result = new double[3];
		result[0] = Math.sin(radians);
		result[1] = Math.cos(radians);
		result[2] = Math.tan(radians);
		return result;
		
	}

}
