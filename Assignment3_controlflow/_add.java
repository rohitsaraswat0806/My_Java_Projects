package Assignment3_controlflow;
import java.util.Scanner;
public class _add {

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        

	        System.out.print("Enter a number (enter 0 to stop): ");
	        double n = scanner.nextDouble();
	        
	        int t=0;

	        while (n != 0) {
	          
	            t += n;
	            
	            
	            System.out.print("Enter another number (enter 0 to stop): ");
	            n = scanner.nextDouble();
	        }
	        
	       
	        System.out.println("\nSum of all numbers is: " + t);
	        
	       
	       
	    
	}

}
