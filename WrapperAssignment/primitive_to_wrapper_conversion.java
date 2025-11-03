package WrapperAssignment;
import java.util.*;
public class primitive_to_wrapper_conversion {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("integer value: ");
	        
	        int sc = scanner.nextInt();
	        Integer wt = sc; 
	        System.out.println(" ");
	        System.out.println("1. Primitive value: " + sc);
	        System.out.println("2. Wrapper value: " + wt);
	        int un = wt;
	        System.out.println("3. Unboxing: " + un);
	    }
}
