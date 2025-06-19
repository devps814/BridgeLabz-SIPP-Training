package Methods;
import java.util.*;

public class Euclidean_distance {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the coordinates of the first point (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("The equation of the line is: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1); // m = (y2 - y1) / (x2 - x1)
        double intercept = y1 - slope * x1; // b = y1 - m * x1
        return new double[]{slope, intercept};
    }

}
