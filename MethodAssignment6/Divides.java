package Assignment6Method;
import java.util.Scanner;
public class Divides {
	public static int quo(int a, int b) {
		int qt = b/a;
		return qt;
	}
	public static int rem(int a, int b) {
		int rm = b%a;
		return rm;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int  b = sc.nextInt();
		int q= quo(a,b);
		int r= rem(a,b);

		
		System.out.print("Reminder is: " +(r)+ " and Quotient is: " +q);
		
	}
	

}
