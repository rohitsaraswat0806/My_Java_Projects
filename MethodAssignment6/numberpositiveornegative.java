package Assignment6Method;
import java.util.Scanner;
public class numberpositiveornegative {

	    public static boolean isPositive(int num) {
	        return num >= 0;
	    }

	
	    public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }

	    public static int compare(int num1, int num2) {
	        if (num1 > num2) return 1;
	        else if (num1 == num2) return 0;
	        else return -1;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = 5;
	        int[] numbers = new int[size];

	    
	        System.out.println("Enter " + size + " numbers:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Number " + (i + 1) + ": ");
	            numbers[i] = sc.nextInt();
	        }

	        System.out.println("\nAnalysis of numbers:");
	
	        for (int num : numbers) {
	            if (isPositive(num)) {
	                System.out.print(num + " is positive and ");
	                if (isEven(num)) {
	                    System.out.println("even.");
	                } else {
	                    System.out.println("odd.");
	                }
	            } else {
	                System.out.println(num + " is negative.");
	            }
	        }


	        int result = compare(numbers[0], numbers[size - 1]);
	        System.out.print("\nComparison of first and last element: ");
	        if (result == 1) {
	            System.out.println(numbers[0] + " is greater than " + numbers[size - 1]);
	        } else if (result == 0) {
	            System.out.println(numbers[0] + " is equal to " + numbers[size - 1]);
	        } else {
	            System.out.println(numbers[0] + " is less than " + numbers[size - 1]);
	        }

	        sc.close();
	    }
	}



