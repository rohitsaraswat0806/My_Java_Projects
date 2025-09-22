package Assignment7_extra_string;
public class Frequent_Character {
	    public static void main(String[] args) {

	        String inputString = "success";
	        int[] charFrequencies = new int[256];

	        for (int i = 0; i < inputString.length(); i++) {

	            char ch = inputString.charAt(i);
	
	            charFrequencies[ch]++;
	        }
	        int maxCount = 0;
	        char mostFrequentChar = ' ';
	        for (int i = 0; i < charFrequencies.length; i++) {
	          
	            if (charFrequencies[i] > maxCount) {
	                maxCount = charFrequencies[i];
	            
	                mostFrequentChar = (char) i;
	            }
	        }
	        System.out.println("String: \"" + inputString + "\"");
	        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
	    }
	}
