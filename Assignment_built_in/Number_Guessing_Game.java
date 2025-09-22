package Assignment_built_in;
import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {

	    private static Random random = new Random();
	    public static int generat(int low, int high) {
	        return random.nextInt(high - low + 1) + low;
	    }
	    public static String get(Scanner sc, int guess) {
	        System.out.print("Is the number " + guess + "? (Enter 'low', 'high', or 'correct'): ");
	        return sc.nextLine().trim().toLowerCase();
	    }
	    public static void startGame() {
	        Scanner sc = new Scanner(System.in);

	        int low = 1;
	        int high = 100;
	        boolean found = false;

	        System.out.println("Number between 1 and 100");

	        while (!found && low <= high) {
	            int guess = generat(low, high);
	            String feedback = get(sc, guess);

	            if (feedback.equals("low")) {
	                low = guess + 1;  
	            } else if (feedback.equals("high")) {
	                high = guess - 1;
	            } else if (feedback.equals("correct")) {
	                System.out.println("Yay! I guessed your number: " + guess);
	                found = true;
	            } else {
	                System.out.println("Invalid input!");
	            }
	        }

	        if (!found) {
	            System.out.println("Hmm... Seems like something went wrong with the inputs.");
	        }

	        sc.close();
	    }

	    public static void main(String[] args) {
	        startGame();
	    }
	}