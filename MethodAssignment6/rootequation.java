package Assignment6Method;
import java.util.Scanner;
public class rootequation {
	



	
	    public static double[] findRoots(double a, double b, double c) {
	        double delta = Math.pow(b, 2) - 4 * a * c;

	        if (delta > 0) {
	            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
	            return new double[]{root1, root2};
	        } else if (delta == 0) {
	            double root = -b / (2 * a);
	            return new double[]{root};
	        } else {
	       
	            return new double[]{};
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Quadratic Equation: ax^2 + bx + c");
	        System.out.print("Enter a: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter b: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter c: ");
	        double c = sc.nextDouble();

	        double[] roots = findRoots(a, b, c);

	        if (roots.length == 0) {
	            System.out.println("No real roots exist for the given quadratic equation.");
	        } else if (roots.length == 1) {
	            System.out.println("There is one real root: " + roots[0]);
	        } else {
	            System.out.println("There are two real roots: " + roots[0] + " and " + roots[1]);
	        }

	        sc.close();
	    
	}


}
