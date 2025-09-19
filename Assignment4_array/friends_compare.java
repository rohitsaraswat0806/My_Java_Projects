package Assignment4_array;
import java.util.Scanner;
public class friends_compare {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        String[] names = {"Amar", "Akbar", "Anthony"};
		        int[] ages = new int[3];
		        double[] heights = new double[3];
		        for (int i = 0; i < 3; i++) {
		            System.out.print("Age" + names[i] + ": ");
		            ages[i] = scanner.nextInt();
		            System.out.print("Height (in inches) " + names[i] + ": ");
		            heights[i] = scanner.nextDouble();
		        }
		        int Age = ages[0];
		        String Friend = names[0];
		        for (int i = 1; i < 3; i++) {
		            if (ages[i] < Age) {
		                Age = ages[i];
		                Friend = names[i];
		            }
		        }
		        double tallest = heights[0];
		        String tallestFriend = names[0];
		        for (int i = 1; i < 3; i++) {
		            if (heights[i] > tallest) {
		                tallest = heights[i];
		                tallestFriend = names[i];
		            }
		        }
		        System.out.println("Youngest friend = " + Friend + " Age = " + Age + " years.");
		        System.out.println("Tallest friend = " + tallestFriend + "Height = " + tallest + " inches.");

		    }
		

}
