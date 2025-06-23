package ObjectsAndClasses;
import java.util.*;

class Student{
	String name;
	int rollNumber;
	double marks;
	
	Student(String name,int rollNumber,double marks){
		this.name=name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	String CalculateGrade() {
		if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
	}
    void displayReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + CalculateGrade());
    }

}

public class Student_Report {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks (out of 100): ");
        double marks = sc.nextDouble();

        Student student = new Student(name, rollNumber, marks);
        student.displayReport();

	}

}
