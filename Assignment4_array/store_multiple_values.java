package Assignment4_array;
import java.util.Scanner;
public class store_multiple_values {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        double[] numbers = new double[10];
	      
	        double total = 0.0;
	        
	        int index = 0;

	        System.out.println("Enter up to 10 positive numbers.");
	        System.out.println("Enter 0 or a negative number to stop and calculate the sum.");

	      
	        while (true) {
	          
	            if (index >= 10) {
	                System.out.println("\nArray is full. Maximum of 10 numbers stored.");
	                break;
	            }

	            System.out.print("Enter number " + (index + 1) + ": ");
	            double userInput = scanner.nextDouble();

	           
	            if (userInput <= 0) {
	                System.out.println("You entered a non-positive number. Stopping input.");
	                break; 
	            }

	        
	            numbers[index] = userInput;
	            index++;
	        }
	        
	        System.out.println("\n--------------------");

	
	        if (index == 0) {
	            System.out.println("No positive numbers were entered.");
	        } else {
	          
	            System.out.print("The numbers entered are: ");
	     
	            for (int i = 0; i < index; i++) {
	                System.out.print(numbers[i] + "  ");
	              
	                total += numbers[i];
	            }
	            
	            System.out.println(); 

	         
	            System.out.printf("The sum of all numbers is: %.2f\n", total);
	        }
	        
	     
	    }
	}


