package Assignment2;
import java.util.Scanner;
public class B3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter unit price: ");
	        double up = sc.nextDouble();

	        System.out.print("Enter quantity: ");
	        int q = sc.nextInt();

	       
	        double totalPrice = up * q;

	      
	        System.out.println("The total purchase price is INR " + totalPrice +
                    " and unit price is INR " + up);
	                        
	    }
	}

	


