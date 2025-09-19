package Assignment4_array;
import java.util.Scanner;
public class frequency {
	
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Number: ");
		        long n = scanner.nextLong(); 
		        int[] f = new int[10];
		        if (n == 0) {
		            f[0]++;
		        } else {
		            long temp = n;
		            while (temp > 0) {
		                int digit = (int) (temp % 10); 
		                f[digit]++; 
		                temp /= 10;
		            }
		        }
		        for (int i = 0; i < 10; i++) {
		            if (f[i] > 0) { 
		                System.out.println("Digit " + i + ": " + f[i] + " times");
		            }
		        
		    }
		}

}
