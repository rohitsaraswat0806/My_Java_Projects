package Assignment5_string1;
import java.util.*;
public class extractorstring {
		    public static char[] CharArray(String str) {
		        char[] Array = new char[str.length()];
		        for (int i = 0; i < str.length(); i++) {
		            Array[i] = str.charAt(i);
		        }
		        return Array;
		    }
		    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
		        return Arrays.equals(arr1, arr2);
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String userInput = scanner.next(); 
		        char[] userDefinedChars = CharArray(userInput);
		        char[] builtInChars = userInput.toCharArray();
		        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);
		        System.out.println("\nUser-defined char array: " + Arrays.toString(userDefinedChars));
		        System.out.println("Built-in result: " + Arrays.toString(builtInChars));
		        System.out.println("Two arrays equal= " + areEqual);

		        scanner.close();
		    }
		

}
