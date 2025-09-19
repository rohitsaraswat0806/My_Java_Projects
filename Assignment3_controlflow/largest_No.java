package Assignment3_controlflow;
import java.util.Scanner;
public class largest_No {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter No1: ");
	        int n1 = sc.nextInt();
	      
	   	 System.out.print("Enter No2: ");
	        int n2 = sc.nextInt();
	   	 System.out.print("Enter No3: ");
	        int n3= sc.nextInt();
		if(n1>n2 && n1>n3) {
			 System.out.print("No1 is largest of three No.");
			 
			
		}
		if(n2>n3 && n2>n1) {
			 System.out.print("No2 is largest of three No.");
		}
		else {
			 System.out.print("No2 is largest of three No.");
			
			
		}
	}

}
