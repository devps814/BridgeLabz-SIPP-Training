package level02;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double base = sc.nextDouble();
		
		double areacm = 0.5 * base * height ;
		double areainch = 2.54 * areacm ;
		
		System.out.println(" The Area of the triangle in sq in is " + areainch + "and sq cm is " + areacm);
		
	}
}
