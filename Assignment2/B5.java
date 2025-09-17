package Assignment2;
import java.util.Scanner;
public class B5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter first number: ");
	        double n1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double n2 = sc.nextDouble();

	        
	        double addition = n1 + n2;
	        double subtraction = n1 - n2;
	        double multiplication = n1 * n2;
	        double division = n1 / n2; 

	       
	        System.out.println("The addition, subtraction, multiplication and division value of two numbers " 
	                           + n1 + " and " + n2 + " is " 
	                           + addition + ", " + subtraction + ", " 
	                           + multiplication + ", and " + division);
	    }
	}



