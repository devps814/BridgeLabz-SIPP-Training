package Built_In;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose conversion type (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 1) {
            double result = fahrenheitToCelsius(temp);
            System.out.println("Temperature in Celsius: " + result);
        } else if (choice == 2) {
            double result = celsiusToFahrenheit(temp);
            System.out.println("Temperature in Fahrenheit: " + result);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
