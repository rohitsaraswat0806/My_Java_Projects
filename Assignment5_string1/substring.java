package Assignment5_string1;
import java.util.Scanner;
public class substring {
	public static void main(String[] abcd) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Starting Index for String1: " );
		int Start = sc.nextInt();
		System.out.print("Enter Ending Index: " );
		int End = sc.nextInt();
		System.out.print("Enter a String Acc to your Index For String1: " );
		String A = sc.next();
		System.out.print("Enter a Starting Index for String2: " );
		int St = sc.nextInt();
		System.out.print("Enter Ending Index: " );
		int Ed = sc.nextInt();
		System.out.print("Enter a String Acc to your Index For String2: " );
		String B = sc.next();
		System.out.print("Enter the index to compare: " );
		int comp = sc.nextInt();
		
		String C = A.substring(Start,End);
		String D = B.substring(St,Ed);
		
		if(A.charAt(comp) == B.charAt(comp)){
			System.out.print("True: " );
			
			
		}
		else {
			System.out.print("False: " );
			
		}

	
		
	}

}
