package Assignment5_string1;
import java.util.Scanner;
public class counter {

		    public static String check(char ch) {
		        if (ch >= 'A' && ch <= 'Z') {
		            ch = (char) (ch + 32); 
		        }
		        if (ch >= 'a' && ch <= 'z') {
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                return "Vowel";
		            } else {
		                return "Consonant";
		            }
		        } else {
		            return "Not a Letter";
		        }
		    }
		    public static int[] count(String str) {
		        int[] counts = new int[2];
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            String charType = check(ch);
		            if (charType.equals("Vowel")) {
		                counts[0]++;
		            } else if (charType.equals("Consonant")) {
		                counts[1]++;
		            }
		        }
		        return counts;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();
		        int[] result = count(inputString);
		        System.out.println("Number of Vowels: " + result[0]);
		        System.out.println("Number of Consonants: " + result[1]);
		    }
		
}
