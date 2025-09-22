package Assignment7_extra_string;
import java.util.Scanner;
public class replace_word {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	 System.out.println("Enter a sentence: ");
	        String originalSentence = sc.nextLine();
	        System.out.println("Enter word to replace: ");
	        String wordToFind = sc.nextLine();
	        System.out.println("Enter new word: ");
	        String wordToReplaceWith = sc.nextLine();
	        String newSentence = replaceWord(originalSentence, wordToFind, wordToReplaceWith);
	        System.out.println("Original Sentence: " + originalSentence);
	        System.out.println("New Sentence:      " + newSentence);
	    }
	    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
	        return sentence.replaceAll(targetWord, replacementWord);
	    }
	}


