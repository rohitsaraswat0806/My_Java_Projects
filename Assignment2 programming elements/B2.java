package Assignment2;
import java.util.Scanner;
public class B2 {
		public static void main(String[] arg) {
			Scanner sc = new Scanner(System.in);
			System.out.print("No of students: ");
			int S = sc.nextInt();
			int handshakes = (S*(S-1))/2; 
			System.out.print("No of Possible Handshakes is " +handshakes );
			
		}
		

	}


