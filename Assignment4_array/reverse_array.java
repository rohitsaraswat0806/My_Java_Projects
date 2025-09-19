package Assignment4_array;
import java.util.Scanner;
public class reverse_array {
	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to reverse: ");
	        int number = scanner.nextInt();
	        
	        if (number == 0) {
	            System.out.println("The reversed number is: 0");
	            scanner.close();
	            return;
	        }


	        int tempNumber = number;

	   
	        int count = 0;
	        while (tempNumber != 0) {
	            tempNumber /= 10;
	            count++;
	        }

	       
	        int[] digits = new int[count];
	        tempNumber = number; 
	        for (int i = count - 1; i >= 0; i--) {
	            digits[i] = tempNumber % 10; 
	            tempNumber /= 10;            
	        }

	    
	        int[] reversedDigits = new int[count];
	        for (int i = 0; i < count; i++) {
	            reversedDigits[i] = digits[count - 1 - i];
	        }

	       
	        System.out.print("The reversed number is: ");
	        for (int digit : reversedDigits) {
	            System.out.print(digit);
	        }
	        System.out.println();

	        scanner.close();
	    }
	

}
