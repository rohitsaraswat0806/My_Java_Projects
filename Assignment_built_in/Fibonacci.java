package Assignment_built_in;
import java.util.Scanner;
public class Fibonacci {
	    public static void gene(int terms) {
	        int first = 0, second = 1;

	        System.out.println("Fibonacci Sequence ");

	        for (int i = 1; i <= terms; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Number of terms ");
	        int terms = sc.nextInt();

	        if (terms <= 0) {
	            System.out.println("Please enter a positive number of terms.");
	        } else {
	            gene(terms);
	        }
	    }
	}