package Methods;
import java.util.*;

public class Calendar {
	static String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    static int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getFirstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100, j = year / 100;
        return (1 + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
    }

    static void printCalendar(int month, int year) {
        System.out.printf("     %s %d\n", monthNames[month - 1], year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int firstDay = getFirstDay(month, year);
        int daysInMonth = monthDays[month - 1];
        if (month == 2 && isLeapYear(year)) daysInMonth++;
        for (int i = 0; i < firstDay; i++) System.out.print("   ");
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(), year = scanner.nextInt();
        printCalendar(month, year);
    }

}
