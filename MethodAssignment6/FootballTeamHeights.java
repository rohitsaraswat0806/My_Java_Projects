package Assignment6Method;
import java.util.Arrays;
import java.util.Scanner;

public class FootballTeamHeights {

  
    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

 
    public static double meanHeight(int[] heights) {
        return sumOfHeights(heights) / (double) heights.length;
    }

   
    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            min = Math.min(min, h);
        }
        return min;
    }

   
    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            max = Math.max(max, h);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamSize = 11;
        int[] heights = new int[teamSize];

        
        System.out.println("Enter heights of " + teamSize + " football players (in cm):");
        for (int i = 0; i < teamSize; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }

    
        int sum = sumOfHeights(heights);
        double mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        
        System.out.println("\nHeights of football players: " + Arrays.toString(heights));
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest player: " + shortest + " cm");
        System.out.println("Tallest player: " + tallest + " cm");

        sc.close();
    }
}
