package Methods;
import java.util.*;


public class UnitConvertor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double yards = sc.nextDouble();
		System.out.println("Feet : " + Yards2Feet(yards));
		double feet = sc.nextDouble();
		System.out.println("Yards : " + Feet2Yards(feet));
		double meter = sc.nextDouble();
		System.out.println("Inches : " + meters2inch(meter));
		double inches = sc.nextDouble();
		System.out.println("Meter : " + inches2meter(inches));
		System.out.println("Centimeter : " + inches2cm(inches));
	}
	public static double Yards2Feet(double yards) {
		return yards * 3.0;
	}
	public static double Feet2Yards(double feet) {
		return feet *0.333333;
	}
	public static double meters2inch(double meter) {
		return meter *  39.3701;
	}
	public static double inches2meter(double inches) {
		return inches * 0.0254;
	}
	public static double inches2cm(double inches) {
		return inches * 2.54;
	}
}
