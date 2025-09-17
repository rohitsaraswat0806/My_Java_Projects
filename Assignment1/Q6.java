package Assignment1;
import java.util.Scanner;
public class Q6 {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Principle:");
		double principle =sc.nextDouble();
		
		System.out.print("Rate:");
		double rate =sc.nextDouble();
		
		System.out.print("Time:");
		double time =sc.nextDouble();
		
		double si= (principle*rate*time)/100;
		
	System.out.print("Simple Intrest:"+si);}

}
