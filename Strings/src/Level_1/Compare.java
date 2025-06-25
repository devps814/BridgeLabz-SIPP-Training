package Level_1;
import java.util.*;
public class Compare {
	public static boolean compareUsingCharAt(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        boolean result = compareUsingCharAt(str1, str2);
        System.out.println("Result using charAt: " + result);
        System.out.println("Result using equals(): " + str1.equals(str2));
    }

}
