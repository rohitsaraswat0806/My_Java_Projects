package Assignment5_string1;
import java.util.Scanner;
public class convertorstring {
	
		    public static String toLower(String text) {
		        StringBuilder result = new StringBuilder();
		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);
		            if (ch >= 'A' && ch <= 'Z') {
		                result.append((char) (ch + 32));
		            } else {
		                result.append(ch);
		            }
		        }
		        return result.toString();
		    }
		    public static boolean compare(String str1, String str2) {
		        if (str1.length() != str2.length()) {
		            return false;
		        }
		        for (int i = 0; i < str1.length(); i++) {
		            if (str1.charAt(i) != str2.charAt(i)) {
		                return false;
		            }
		        }
		        return true;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a complete text: ");
		        String inputText = scanner.nextLine();
		        String Lowercase = toLower(inputText);
		        String builtIn = inputText.toLowerCase();

		        System.out.println("Original text: " + inputText);
		        System.out.println("Lowercase (custom method): " + Lowercase);
		        System.out.println("Lowercase (built-in method): " + builtIn);
		        boolean areEqual = compare(Lowercase, builtIn);

		        if (areEqual) {
		            System.out.println("The lowercase results from both methods are identical.");
		        } else {
		            System.out.println("The lowercase results from both methods are NOT identical.");
		        
		    
		}
	    }
	}
