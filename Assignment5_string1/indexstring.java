package Assignment5_string1;
import java.util.*;
public class indexstring {
		    public static void generateException(String[] names) {
		        System.out.println("\nAttempting to access an invalid index to generate an exception...");
		        System.out.println("Name at index " + names.length + ": " + names[names.length]); 
		    }
		    public static void handleException(String[] names) {
		        System.out.println("\nAttempting to access an invalid index with exception handling...");
		        try {
		            System.out.println("Name at index " + names.length + ": " + names[names.length]);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		            System.err.println("Error: You tried to access an array index that does not exist.");
		        } catch (RuntimeException e) { 
		            System.err.println("Caught a generic RuntimeException: " + e.getMessage());
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of names you want to store: ");
		        int size = scanner.nextInt();
		        scanner.nextLine();

		        String[] names = new String[size];

		        System.out.println("Enter " + size + " names:");
		        for (int i = 0; i < size; i++) {
		            System.out.print("Name " + (i + 1) + ": ");
		            names[i] = scanner.nextLine();
		        }
		        handleException(names);

		        System.out.println("\nProgram continues after handling the exception.");
		    }
		

}
