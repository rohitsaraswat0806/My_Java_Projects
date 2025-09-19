package Assignment3_controlflow;
import java.util.Scanner;
public class subjects_marks {

	    public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);

	        System.out.print(" Physics (out of 100): ");
	        int physicsMarks = input.nextInt();

	        System.out.print(" Chemistry (out of 100): ");
	        int chemistryMarks = input.nextInt();

	        System.out.print(" Maths (out of 100): ");
	        int mathsMarks = input.nextInt();

	        
	        if (physicsMarks < 0 || physicsMarks > 100 ||
	            chemistryMarks < 0 || chemistryMarks > 100 ||
	            mathsMarks < 0 || mathsMarks > 100) {
	            System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
	        } else {
	           
	            int totalMarks = physicsMarks + chemistryMarks + mathsMarks;

	          
	            double percentage = (double) totalMarks / 300.0 * 100;

	          
	            char grade;
	            if (percentage >=80) {
	                grade = 'A';
	            } else if (percentage >= 70 && percentage<=79) {
	                grade = 'B';
	            } else if (percentage >= 60 && percentage<69) {
	                grade = 'C';
	            } else if (percentage >= 50 && percentage<=59) {
	                grade = 'D';
	            }
	              else if (percentage >= 40 && percentage<=49) {
	                grade = 'D';
	            } else {
	                grade = 'F'; 
	            }

	    
	            System.out.printf("Total Marks: %d%n", totalMarks);
	            System.out.printf("Percentage: %.2f%%%n", percentage);
	            System.out.println("Grade: " + grade);
	        }

	        
	    }
	}


