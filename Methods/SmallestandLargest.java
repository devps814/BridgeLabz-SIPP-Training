package Methods;
import java.util.*;

public class SmallestandLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int[] result = SmallestAndLargest(num1, num2 , num3);
		System.out.println("Smallest number : " + result[0]);
		System.out.println("Largest number : " + result[1]);
		
	}
	public static int[] SmallestAndLargest(int a , int b , int c) {
		int smallest = Math.min(a, Math.min(b, c));
		int largest = Math.max(a, Math.max(b,c));
		return new int[]{smallest ,largest};
	}

}
