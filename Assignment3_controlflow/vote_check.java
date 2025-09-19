package Assignment3_controlflow;
import java.util.Scanner;
public class vote_check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        if(age>=18) {
        	System.out.print("You Can vote : ");
        }
        else {
        	System.out.print("You Can not vote : ");
        	
        }
		
	}
	
	
}