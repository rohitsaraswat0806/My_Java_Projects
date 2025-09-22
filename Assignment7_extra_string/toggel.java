package Assignment7_extra_string;
import java.util.Scanner;
public class toggel {  
	    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter String: ");
	        String originalString =sc.nextLine();     
	        char[] characters = originalString.toCharArray();
     
	        for (int i = 0; i < characters.length; i++) {           
	            char currentChar = characters[i];
	            if (Character.isUpperCase(currentChar)) {              
	                characters[i] = Character.toLowerCase(currentChar);
	            }
	            else if (Character.isLowerCase(currentChar)) {
	                characters[i] = Character.toUpperCase(currentChar);
	            }
	        }
	        String toggledString = new String(characters);
	        System.out.println("Original String: " + originalString);
	        System.out.println("Toggled String:  " + toggledString);
	    }

}