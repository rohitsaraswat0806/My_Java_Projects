package Assignment3_controlflow;
import java.util.Scanner;
public class _table {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int a = sc.nextInt();
		for(int i =6; i<=9; i++) {
			int t =a*i;
			 System.out.println(a+ " * " +i+ " = " +t);
			
		}

}
}