package Assignment3_controlflow;
import java.util.Scanner;

public class Add_natural_no {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        System.out.print("Enter a number: ");
	        int n= sc.nextInt();

	    
	        if (n >= 1) { 
	            int sum = n * (n + 1) / 2;
	            System.out.println(n + " is natural number and  sum is " + sum);
	        } else {
	            System.out.println("The number " + n + " is not a natural number");
	        }
	    }
	}


