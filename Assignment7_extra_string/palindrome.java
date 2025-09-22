package Assignment7_extra_string;
import java.util.Scanner;
public class palindrome {
	
	
		    public static boolean p(String str) {
		        String sc = str.toLowerCase();

		        int left = 0;
		        int right = sc.length() - 1;

		        while (left < right) {
		            if (sc.charAt(left) != sc.charAt(right)) {
		                return false; 
		            }
		            left++;
		            right--;
		        }
		        return true; 
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter Number ");
		        String a = scanner.nextLine();

		        if (p(a)) {
		            System.out.println("'" + a + "' is a palindrome.");
		        } else {
		            System.out.println("'" + a + "' is not a palindrome.");
		   }
		}

}
