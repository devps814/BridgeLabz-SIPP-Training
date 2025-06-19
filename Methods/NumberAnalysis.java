package Methods;
import java.util.*;

public class NumberAnalysis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			
			 if (isPositive(numbers[i])) {
	                if (isEven(numbers[i])) {
	                    System.out.println(numbers[i] + " is Positive and Even");
	                } else {
	                    System.out.println(numbers[i] + " is Positive and Odd");
	                }
	            } else if (numbers[i] < 0) {
	                System.out.println(numbers[i] + " is Negative");
	            } else {
	                System.out.println(numbers[i] + " is Zero");
	            }
		}
		 int result = compare(numbers[0], numbers[4]);
	        System.out.print("Comparison between first and last element: ");
	        if (result == 0) {
	            System.out.println("Both are Equal");
	        } else if (result == 1) {
	            System.out.println("First element is Greater than Last");
	        } else {
	            System.out.println("First element is Less than Last");
	        }
            
		
	}
	public static boolean isPositive(int number) {
        return number > 0;
    }
	 public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }
	 public static int compare(int num1, int num2) {
	        if (num1 > num2) return 1;
	        else if (num1 == num2) return 0;
	        else return -1;
	    }

}
