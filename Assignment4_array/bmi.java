package Assignment4_array;
import java.util.Scanner;
public class bmi {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        System.out.print("persons: ");
		        int Persons = input.nextInt();
		        double[][] Data = new double[Persons][3];
		        String[] weighte = new String[Persons];
		        for (int i = 0; i < Persons; i++) {
		            System.out.println( + (i + 1) + "");
		            double weight;
		            do {
		                System.out.print("Weight ");
		                weight = input.nextDouble();
		                if (weight <= 0) {
		                    System.out.println("Please try again.");
		                }
		            } while (weight <= 0);
		            Data[i][0] = weight;
		            double height;
		            do {
		                System.out.print("Height ");
		                height = input.nextDouble();
		                if (height <= 0) {
		                    System.out.println("Please try again.");
		                }
		            } while (height <= 0);
		            Data[i][1] = height;
		            double bmi = Data[i][0] / (Data[i][1] * Data[i][1]);
		            Data[i][2] = bmi;
		            if (bmi < 18.5) {
		                weighte[i] = "Underweight";
		            } else if (bmi >= 18.5 && bmi < 24.9) {
		                weighte[i] = "Normal weight";
		            } else if (bmi >= 24.9 && bmi < 29.9) {
		                weighte[i] = "Overweight";
		            } else {
		                weighte[i] = "Obesity";
		            }
		        }
		        for (int i = 0; i < Persons; i++) {
		            System.out.println( + (i + 1) + " ");
		            System.out.printf("  Weight: %.2f kg\n", Data[i][0]);
		            System.out.printf("  Height: %.2f m\n", Data[i][1]);
		            System.out.printf("  BMI: %.2f\n", Data[i][2]);
		            System.out.println("  Status: " + weighte[i]);
		        }
		    }
		

}
