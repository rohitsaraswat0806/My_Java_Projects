package Assignment6Method;
import java.util.Scanner;
public class handshakes {
	 public static int calculateHandshakes(int S) {
	        return (S * (S - 1)) / 2;
	    }
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("No of students: ");
		int S = sc.nextInt();
		int handshakes = calculateHandshakes(S);
		System.out.print("No of Possible Handshakes is " +handshakes );
		
	}
	

}





