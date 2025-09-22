package Assignment_built_in;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class date_formate {
	    public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.print("Date (yyyy-MM-dd): ");
	         String input = sc.nextLine();
	        LocalDate cd = LocalDate.parse(input);
	        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

	        System.out.println("In dd/MM/yyyy format: " + cd.format(format1));
	        System.out.println("In yyyy-MM-dd format: " + cd.format(format2));
	        System.out.println("In EEE, MMM dd, yyyy format: " + cd.format(format3));
	    }
	}