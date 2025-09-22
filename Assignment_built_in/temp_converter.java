package Assignment_built_in;
import java.util.Scanner;
public class temp_converter {
	   public static double cToF(double c) {
	        return (c * 9 / 5) + 32;
	    }
	    public static double fToC(double f) {
	        return (f - 32) * 5 / 9;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter C or F : ");
	        char choice = sc.next().charAt(0);

	        if (choice == 'C' || choice == 'c') {
	            System.out.print("Enter Celsius: ");
	            double c = sc.nextDouble();
	            System.out.println("Fahrenheit = " + cToF(c));
	        } else if (choice == 'F' || choice == 'f') {
	            System.out.print("Enter Fahrenheit: ");
	            double f = sc.nextDouble();
	            System.out.println("Celsius = " + fToC(f));
	        } else {
	            System.out.println("Invalid choice!");
	        }
	    }
	}
