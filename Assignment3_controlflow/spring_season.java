package Assignment3_controlflow;
import java.util.Scanner;
public class spring_season {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date: ");
		int d = sc.nextInt();
		System.out.print("Enter month: ");
		int m = sc.nextInt();
		
		if(d>=20 && d<=20 && m>=3 && m<=6) {
			System.out.print("Spring Season ");
			
		}
		else {
			System.out.print("Not Spring Season ");
		}
		
	}

}
