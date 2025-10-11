package Assignment6Method;
import java.util.Scanner;
public class factor {
	

	

		    public static int[] findFactors(int n) {
		        int count = 0;
		        for (int i = 1; i <= n; i++) {
		            if (n % i == 0) {
		                count++;
		            }
		        }
		        int[] factors = new int[count];
		        int index = 0;
		        
		        for (int i = 1; i <= n; i++) {
		            if (n % i == 0) {
		                factors[index++] = i;
		            }
		        }
		        return factors;
		    }
		    
		    public static int sum(int[] factors) {
		        int sum = 0;
		        for (int f : factors) {
		            sum += f;
		        }
		        return sum;
		    }

		    public static long product(int[] factors) {
		        long product = 1;
		        for (int f : factors) {
		            product *= f;
		        }
		        return product;
		    }

		    public static int sumOfSquares(int[] factors) {
		        int sumSq = 0;
		        for (int f : factors) {
		            sumSq += Math.pow(f, 2);
		        }
		        return sumSq;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();

		        int[] factors = findFactors(n);

		        System.out.print("Factors: ");
		        for (int f : factors) {
		            System.out.print(f + " ");
		        }
		        System.out.println();

		        System.out.println("Sum: " + sum(factors));
		        System.out.println("Produc: " + product(factors));
		        System.out.println("Squares: " + sumOfSquares(factors));

		        sc.close();
		    }
		

}
