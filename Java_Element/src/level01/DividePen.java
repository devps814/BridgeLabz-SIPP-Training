package level01;

public class DividePen {
	public static void main(String[] args) {
		int pens = 14;
		int students = 3;
		
		int penspereach = pens / students;
		int remainingpen = pens % students ;
		System.out.println("The Pen per student " + penspereach + "and the remaining pen are not distributed is " + remainingpen);
	}
}
