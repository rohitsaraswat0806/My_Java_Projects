package Assignment6Method;
import java.util.Scanner;
public class simpleintrest {
	public static double calculatesimpleintrest(double p, double r, double t) {
		return (p*r*t)/100;
	}
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal: ");
		double p= sc.nextDouble();
		System.out.print("Rate: ");
		double r= sc.nextDouble();
		System.out.print("Time: ");
		double t= sc.nextDouble();
		
		double si= calculatesimpleintrest(p,r,t);
		
		System.out.println("The Simple Intrest is " +(si)+" for Principle " +(p)+ " Rate " +(r)+ " Time " +t );

		
		
	}

}
