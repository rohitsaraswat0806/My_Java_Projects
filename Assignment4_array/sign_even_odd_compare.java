package Assignment4_array;
import java.util.Scanner;

public class sign_even_odd_compare {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int numb[] = new int[5];
	        for(int i = 0; i < numb.length; i++) {
	            System.out.print("Enter number " + (i+1) + ": ");
	            numb[i] = sc.nextInt();
	        }

	       
	        for(int i = 0; i < numb.length; i++) {
	            int num = numb[i];

	            if(num > 0) {
	                if(num % 2 == 0) {
	                    System.out.println(num + " is Positive and Even");
	                } else {
	                    System.out.println(num + " is Positive and Odd");
	                }
	            }
	            else if(num < 0) {
	                System.out.println(num + " is Negative");
	            }
	            else {
	                System.out.println(num + " is Zero");
	            }
	        }

	       
	        int first = numb[0];
	        int last = numb[numb.length - 1];

	        System.out.print("Comparison of first and last No: ");
	        if(first == last) {
	            System.out.println("Both are Equal");
	        } else if(first > last) {
	            System.out.println("First No is Greater than Last No");
	        } else {
	            System.out.println("First No is Less than Last No");
	        }

	    
	    }
	}

	
	


