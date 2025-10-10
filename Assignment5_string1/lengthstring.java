package Assignment5_string1;
import java.util.*;
public class lengthstring {
		    public static int findString(String str) {
		        int count = 0;
		        try {
		            while (true) { 
		                str.charAt(count); 
		                count++; 
		            }
		        } catch (StringIndexOutOfBoundsException e) {}
		        return count;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String userInput = scanner.next(); 
		        int customLength = findString(userInput);
		        System.out.println("Length using custom method: " + customLength);
		        int builtInLength = userInput.length();
		        System.out.println("Length using built-in length() method: " + builtInLength);
		    
		}

}
