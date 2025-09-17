package Assignment1;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] abc){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius:");
		double radius = sc.nextDouble();
		
		double Area = 3.14*radius*radius;
		
		System.out.print("Area of Circle is:" + Area);
	}

}
