package Assignment5_string1;
import java.util.Scanner;

public class compare_string {
    public static void main(String[] argabcd) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Str No1: ");
        String R=sc.next();
        System.out.print("Enter Str No2: ");
        String S=sc.next();
        if(R.equals(S)) {
  		  System.out.println("String is Equal");
  	  }else {
  		  System.out.println("String is Not Equal");
  	  }

        
       if(R.charAt(2)==S.charAt(2)) {
    	  System.out.print("String is True");
       }
       else{
    	   System.out.print(" String is False");
    	 
       } 
}}