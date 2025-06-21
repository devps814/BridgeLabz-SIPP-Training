package Built_In;
import java.util.Random;
import java.util.Scanner;
public class Number_Guessing {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int lower = 1;
	        int upper = 100;
	        String feedback;
	        int guess;

	        System.out.println("Think of a number between 1 and 100.");
	        System.out.println("The computer will try to guess it. Respond with 'low', 'high', or 'correct'.");

	        while (true) {
	            guess = generateGuess(lower, upper);
	            System.out.println("Computer guesses: " + guess);

	            feedback = getUserFeedback(scanner);

	            if (feedback.equalsIgnoreCase("correct")) {
	                System.out.println("Hooray! The computer guessed your number correctly!");
	                break;
	            } else if (feedback.equalsIgnoreCase("low")) {
	                lower = guess + 1;
	            } else if (feedback.equalsIgnoreCase("high")) {
	                upper = guess - 1;
	            } else {
	                System.out.println("Invalid input. Please respond with 'low', 'high', or 'correct'.");
	            }

	            // Prevent infinite loop in case of inconsistent feedback
	            if (lower > upper) {
	                System.out.println("Oops! Your feedback seems inconsistent. Game over.");
	                break;
	            }
	        }

	        scanner.close();
	    }

	    // Generate a guess in the range [low, high]
	    public static int generateGuess(int low, int high) {
	        Random random = new Random();
	        return low + random.nextInt(high - low + 1);
	    }

	    // Get user feedback
	    public static String getUserFeedback(Scanner scanner) {
	        System.out.print("Is the guess 'low', 'high', or 'correct'? ");
	        return scanner.nextLine().trim().toLowerCase();
	    }
	}


