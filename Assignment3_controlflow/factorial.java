package Assignment3_controlflow;
import java.util.Scanner;
public class factorial {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No:");
		int n = sc.nextInt();
		int fact =1;
		for(int i=1; i<=n; i++ ) {
			 fact = fact*i;
	
		}
		System.out.print("Factorial of " +(n)+ " is " +fact);
		}
	}






