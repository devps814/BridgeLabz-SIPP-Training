package Methods;
import java.util.*;

public class HeightOfplayer {
	private static final int PLAYER_COUNT = 11;

    public static void main(String[] args) {
        int[] heights = new int[PLAYER_COUNT];
        generateRandomHeights(heights);
        System.out.println("Player Heights (in cms): " + Arrays.toString(heights));
        System.out.println("Mean Height: " + calculateMeanHeight(heights));
        System.out.println("Shortest Height: " + findShortestHeight(heights));
        System.out.println("Tallest Height: " + findTallestHeight(heights));
    }

    private static void generateRandomHeights(int[] heights) {
        Random random = new Random();
        for (int i = 0; i < PLAYER_COUNT; i++) {
            heights[i] = 150 + random.nextInt(101); // Height between 150 and 250
        }
    }

    private static double calculateMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    private static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    private static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    private static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

}
