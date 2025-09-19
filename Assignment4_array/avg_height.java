package Assignment4_array;
import java.util.Scanner;
public class avg_height {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        double[] heights = new double[11];

		        double sum = 0;
		        System.out.println("Height of 11 football players:");
		        for (int i = 0; i < 11; i++) {
		            System.out.print("Player " + (i + 1) + ": ");
		            heights[i] = scanner.nextDouble();
		            sum += heights[i];
		        }
		        double mean = sum / 11;
		        System.out.println("Average height " + mean);
		        
		    }
		}


