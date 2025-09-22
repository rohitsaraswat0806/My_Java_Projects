package Assignment7_extra_string;
import java.util.Scanner;
public class reverse_string {
	public static void main (String[] arg) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String");
		String str = sc.nextLine();	
		String reverse_str = " ";
		for(int i = str.length()-1; i>=0; i--) {
			reverse_str += str.charAt(i);
		}
		System.out.print("Reverse String is " +reverse_str);
	}

}
