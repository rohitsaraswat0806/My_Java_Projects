package Assignment3_controlflow;
import java.util.Scanner;

public class ArmstrongNo {
	    public static void main(String[] args) {
	       
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number to check if it's an Armstrong number: ");
	        int number = input.nextInt();

	        
	        int sum = 0;
	
	        int originalNumber = number;
	        int remainder;

	 
	        while (originalNumber != 0) {
	            
	            remainder = originalNumber % 10;

	         
	            sum += Math.pow(remainder, 3);

	            originalNumber /= 10;
	        }

	
	        if (sum == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        
	    }
	}



