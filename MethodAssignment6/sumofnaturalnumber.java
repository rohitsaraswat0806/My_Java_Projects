package Assignment6Method;
import java.util.Scanner;
public class sumofnaturalnumber {
	public static int sum(int n) {
		int sum = n*(n+1)/2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No:" );
		int n = sc.nextInt();
		int total= sum(n);
		System.out.print("Sum of All N Natural Numbers is: "+total);
		
	}
	

}
