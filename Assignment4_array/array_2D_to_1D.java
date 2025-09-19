package Assignment4_array;
import java.util.Scanner;
public class array_2D_to_1D {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Rows: ");
		        int rows = scanner.nextInt();

		        System.out.print("Columns: ");
		        int columns = scanner.nextInt();
		        int[][] twoDArray = new int[rows][columns];
		        System.out.println("Elements of the 2D array:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.printf("Element at [%d][%d]: ", i, j);
		                twoDArray[i][j] = scanner.nextInt();
		            }
		        }
		        System.out.println();
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                System.out.print(twoDArray[i][j] + "\t");
		            }
		            System.out.println();
		        }
		        int[] oneDArray = new int[rows * columns];
		        int index = 0; 
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                oneDArray[index] = twoDArray[i][j];
		                index++;
		            }
		        }
		        for (int i = 0; i < oneDArray.length; i++) {
		            System.out.print(oneDArray[i] + " ");
		        }
		        System.out.println();
		    }
		

}
