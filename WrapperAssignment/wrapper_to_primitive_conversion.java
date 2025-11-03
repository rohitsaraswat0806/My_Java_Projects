package WrapperAssignment;
import java.util.*;
public class wrapper_to_primitive_conversion {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("integer value: ");
        
        Double sc = scanner.nextDouble();
        double wt = sc; 
        System.out.println(" ");
        System.out.println("1. Wrapper value: " + sc);
        System.out.println("2. Premitive value: " + wt);
        double bo = wt;
        System.out.println("3. Boxing: " + bo);
		    }

}
