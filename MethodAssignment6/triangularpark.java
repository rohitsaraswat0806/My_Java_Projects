package Assignment6Method;
import java.util.Scanner;
public class triangularpark {

	    public static double calculateRounds(double side1, double side2, double side3, double totalDistanceMeters) {
	        double perimeter = side1 + side2 + side3;
	        return totalDistanceMeters / perimeter;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.println("Enter the three sides of the triangular park in meters:");
	        System.out.print("Side 1: ");
	        double side1 = sc.nextDouble();
	        System.out.print("Side 2: ");
	        double side2 = sc.nextDouble();
	        System.out.print("Side 3: ");
	        double side3 = sc.nextDouble();

	        double totalDistance = 5000;

	        double rounds = calculateRounds(side1, side2, side3, totalDistance);

	        System.out.println("\nPerimeter of the triangular park: " + (side1 + side2 + side3) + " meters");
	        System.out.printf("To complete a 5 km run, athlete must complete %.2f rounds.%n", rounds);

	        sc.close();
	    }
	


}
