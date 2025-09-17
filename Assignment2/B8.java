package Assignment2;
import java.util.Scanner;
public class B8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int  b = sc.nextInt();
		int q= a/b;
		int r= a%b;

		
		System.out.print("Reminder is: " +(r)+ " and Quotient is: " +q);
		
	}
	

}

