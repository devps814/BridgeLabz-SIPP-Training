package level01;

import java.util.*;
public class UpdateQuessix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fees = sc.nextInt();
		int discountpercent = sc.nextInt();
		int discount = (fees * discountpercent) / 100 ;
		int finalfee = fees - discount ;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfee);
	}
}
