package Assignment4_array;

import java.util.Scanner;

public class table_of_No {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a No: ");
		int[] b=new int[11];
		int a=sc.nextInt();
		for(int i=1;i<11;i++) {
			b[i]=(a*i);
		}
		for(int i=1;i<11;i++) {
			System.out.println(+(a)+ " * " +i+ " = " +b[i]);
		}
		
	}

}
