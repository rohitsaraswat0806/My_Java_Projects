package Assignment5_string1;
import java.util.*;
public class numberformetstring {
		    public static void generateNumberFormatException(String input) {
		        System.out.println("\nAttempting to generate NumberFormatException...");
		        int number = Integer.parseInt(input); 
		        System.out.println("Parsed number: " + number); 
		    }
		    public static void handleNumberFormatException(String input) {
		        System.out.println("\nAttempting to handle NumberFormatException...");
		        try {
		            int number = Integer.parseInt(input);
		            System.out.println("Parsed number: " + number);
		        } catch (NumberFormatException e) {
		            System.err.println("Caught NumberFormatException: " + e.getMessage());
		            System.err.println("The input string '" + input + "' could not be converted to an integer.");
		        } catch (RuntimeException e) {
		            System.err.println("Caught a generic RuntimeException: " + e.getMessage());
		        } finally {
		            System.out.println("Finally block executed.");
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string (e.g., 'abc'): ");
		        String invalidInput = scanner.nextLine();

		        System.out.print("Enter a string(e.g., '123'): ");
		        String validInput = scanner.nextLine();
		        try {
		            generateNumberFormatException(invalidInput);
		        } catch (NumberFormatException e) {
		            System.err.println("NumberFormatException after calling generateNumberFormatException: " + e.getMessage());
		            System.err.println("Program execution continues after catching the exception");
		        }
		        handleNumberFormatException(invalidInput);
		        handleNumberFormatException(validInput); 
		    }
		
	

}
