package Assignment7_extra_string;
import java.util.Scanner;
public class count_vow_cons {
	public static void main(String[] arg) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter A String: " );
		        String word = sc.nextLine();
		        
		        String word1 = word.toLowerCase();
		        
		        int vow = 0;
		        int cons = 0;
		        for(int i =0; i<word1.length(); i++ ) {
		        	char a = word1.charAt(i);
		        	if(a>='a' && a<='z') {
		        	if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
		        		vow++;}
	
		        	else {
		        		cons++;
		        	}}
		        	
		        }
		        System.out.print("Vowels is " +vow+ " and Consonents is " +cons);
		        	
		        }
	
	}