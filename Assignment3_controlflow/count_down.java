package Assignment3_controlflow;
import java.util.Scanner; 
public class count_down {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);      
	        System.out.print("Enter countdown start number: ");
	        int count = scanner.nextInt();

	        System.out.println("\n🚀 Rocket launch Count Down Start!");
	        while (count >= 1) {
	            System.out.println(count);
	       
	            count--;
	        }

	        System.out.println("Launch! 🌟");

	    }

}
