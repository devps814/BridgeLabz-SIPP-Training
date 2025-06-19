package Methods;
import java.util.*;

public class FriendComparision {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        String[] friends = {"Amar", "Akbar", "Anthony"};
	        int[] ages = new int[3];
	        double[] heights = new double[3];

	        System.out.println("Enter ages and heights of Amar, Akbar and Anthony:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(friends[i] + "'s Age: ");
	            ages[i] = sc.nextInt();
	            System.out.print(friends[i] + "'s Height (in cm): ");
	            heights[i] = sc.nextDouble();
	        }
	        int youngestIndex = findYoungest(ages);
	        int tallestIndex = findTallest(heights);

	        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
	        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");
	        
		
	}
	 public static int findYoungest(int[] ages) {
	        int minAge = ages[0];
	        int index = 0;
	        for (int i = 1; i < ages.length; i++) {
	            if (ages[i] < minAge) {
	                minAge = ages[i];
	                index = i;
	            }
	        }
	        return index;
	 }
	 public static int findTallest(double[] heights) {
	        double maxHeight = heights[0];
	        int index = 0;
	        for (int i = 1; i < heights.length; i++) {
	            if (heights[i] > maxHeight) {
	                maxHeight = heights[i];
	                index = i;
	            }
	        }
	        return index;
	    }
	 

}
