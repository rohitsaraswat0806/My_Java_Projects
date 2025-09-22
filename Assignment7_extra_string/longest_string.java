package Assignment7_extra_string;
import java.util.Scanner;
public class longest_string {
	    public static String fls(String sentence) {
	        if (sentence == null || sentence.trim().isEmpty()) {
	            return "";
	        }
	        String[] words = sentence.split("\\s+"); 

	        String lw = "";
	        if (words.length > 0) {
	            lw = words[0]; 
	        }
	        for (String word : words) {
	            String cleanWord = word.replaceAll("[^a-zA-Z]", ""); 
	            if (cleanWord.length() > lw.replaceAll("[^a-zA-Z]", "").length()) {
	                lw = word;
	            }
	        }
	        return lw;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String a = scanner.nextLine();
	        String longest = fls(a);
	        if (!longest.isEmpty()) {
	            System.out.println("The longest word in the sentence is: " + longest);
	        } else {
	            System.out.println("No words found in the sentence.");
	   }}}