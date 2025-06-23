package ObjectsAndClasses;
import java.util.Scanner;

class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleArea {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter radius of the circle: ");
	        double radius = sc.nextDouble();

	        Circle c = new Circle(radius);
	        c.displayDetails();
	        }
	 }
