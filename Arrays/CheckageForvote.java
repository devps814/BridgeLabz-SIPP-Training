package Arrays;
import java.util.Scanner;

public class CheckageForvote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}
		for (int i =0 ; i < arr.length; i++) {
			if (arr[i] >= 18) {
				System.out.println("The student with the age : " + arr[i] + " can vote ");
			}else if (arr[i] < 18 && arr[i] >0 ) {
				System.out.println(" The student with the age : " + arr[i] + " cannot vote ");
			}else {
				System.out.println("Invalid age");
			}
		}
	}

}
