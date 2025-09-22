package Assignment_built_in;
import java.time.LocalDate;
import java.util.Scanner;
public class date_compare {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("First date (yyyy-mm-dd): ");
	        String fdi = sc.nextLine();
	        LocalDate fd = LocalDate.parse(fdi);
	        System.out.print("Second date (yyyy-mm-dd): ");
	        String sdi = sc.nextLine();
	        LocalDate sd = LocalDate.parse(sdi);

	        if (fd.isBefore(sd)) {
	            System.out.println("The first date is before the second date.");
	        } else if (fd.isAfter(sd)) {
	            System.out.println("The first date is after the second date.");
	        } else if (fd.isEqual(sd)) {
	            System.out.println("Both dates are the same.");
	        }
	    }
	}