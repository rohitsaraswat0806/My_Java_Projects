package Assignment3_controlflow;
import java.util.Scanner;
public class div_with_5 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int a = sc.nextInt();
		
		if(a%5==0) {
			System.out.print("Divisible with 5");
			
		}
		else {
			System.out.print("Not Divisible with 5");
		}
	}

}
