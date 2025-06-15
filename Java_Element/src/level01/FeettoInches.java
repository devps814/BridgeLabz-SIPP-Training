package level01;

import java.util.*;
public class FeettoInches {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int cmTofeet = height * 12 ;
		double feetToinches = cmTofeet * 2.54;
		System.out.println("Your Height in cm is " + height + " while in feet is " + cmTofeet + " and inches is " + feetToinches );
	}
}
