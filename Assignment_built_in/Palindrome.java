package Assignment_built_in;
import java.util.Scanner;
public class Palindrome {
	    public static String get(Scanner sc) {
	        System.out.print("Enter a word or phrase: ");
	        return sc.nextLine();
	    }
	    public static boolean isp(String str) {
	        str = str.replaceAll("\\s+", "").toLowerCase();

	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; 
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
	    public static void dis(String str, boolean result) {
	        if (result) {
	            System.out.println("\"" + str + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + str + "\" is not a palindrome.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = get(sc);
	        boolean result = isp(input);
	        dis(input, result);
	    }
	}