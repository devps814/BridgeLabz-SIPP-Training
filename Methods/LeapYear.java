package Methods;
import java.util.*;


public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		checkLeapYear(year);
	}
	public static void checkLeapYear(int year) {
		if (year >= 1582) {
			if (year % 4 == 0) {
				System.out.println("This year is a Leap Year");
			}
		}else {
			System.out.println("This year is not a Leap Year");
		}
	}
}
