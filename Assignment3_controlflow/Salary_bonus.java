package Assignment3_controlflow;
import java.util.Scanner;
public class Salary_bonus {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		int s = sc.nextInt();
		System.out.print("Enter service year: ");
		int y = sc.nextInt();
		
		if(y>5) {
			double b = (s*5)/100;
			double sal = s+b;
			System.out.print("Final Salary is: "+sal);
		}
		else {
			System.out.print("Final Salary is: "+s);
		}
	}

}
