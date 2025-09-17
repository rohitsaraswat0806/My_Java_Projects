package Assignment2;
import java.util.Scanner;
public class B9 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter value of a: ");
	        int a = sc.nextInt();

	        System.out.print("Enter value of b: ");
	        int b = sc.nextInt();

	        System.out.print("Enter value of c: ");
	        int c = sc.nextInt();

	        int r1 = a + b * c;   
	        int r2 = a * b + c;   
	        int r3 = c + a / b;   
	        int r4 = a % b + c;   

	        
	        System.out.println("The results of int Operations are " 
	                           + r1 + ", " + r2 + ", " 
	                           + r3 + ", and " + r4);
	    }
	

}
