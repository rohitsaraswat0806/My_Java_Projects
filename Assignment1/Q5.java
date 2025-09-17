package Assignment1;
import java.util.Scanner;
public class Q5 {
	public static void main(System[] abc) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radius of Cylinder:");
		double radius = sc.nextDouble();
		
		System.out.print("Height of Cylinder:");
		double height = sc.nextDouble();
		
		double volume = 3.14*radius*radius*height*height;
		
		System.out.print("Volume of Cylinder is:" +volume);
	}

}
