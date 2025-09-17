package Assignment2;
import java.util.Scanner;

public class B7 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	    
	        System.out.print("Enter base of triangle in cm: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter height of triangle in cm: ");
	        double h = sc.nextDouble();

	        
	        double areacm = 0.5 * b * h;

	       
	        double areaInch = areacm / 6.4516;

	        System.out.println("The Area of the triangle in sq in is " + areaInch +
	                           " and sq cm is " + areacm);
	   
	}


}
