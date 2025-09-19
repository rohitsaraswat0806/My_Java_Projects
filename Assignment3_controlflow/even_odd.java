package Assignment3_controlflow;
import java.util.Scanner;
public class even_odd {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++ ) {
			if(i%2==0) {
				System.out.println(i+ " is even No.");
			}
			else {
				System.out.println(i+ " is odd No.");
			}
		}
	}

}
