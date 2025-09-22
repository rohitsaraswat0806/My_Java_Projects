package Assignment_built_in;
import java.util.Scanner;
public class prime_No {
	    public static boolean prime(int n) {
	        if (n <= 1) {
	            return false; 
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false; 
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Number ");
	        int number = sc.nextInt();
	        if (prime(number)) {
	            System.out.println(number + " Prime number.");
	        } else {
	            System.out.println(number + " Not a prime number.");
	        }
	    }
	}
