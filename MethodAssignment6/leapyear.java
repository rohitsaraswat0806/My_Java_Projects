package Assignment6Method;
import java.util.*;
public class leapyear {
		    public static boolean isLeapYear(int year) {
		        if (year < 1582) {
		            System.out.println("Warning:valid for years >= 1582 ");
		        }
		        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a year: ");
		        int year = scanner.nextInt();

		        if (isLeapYear(year)) {
		            System.out.println(year + " Leap Year.");
		        } else {
		            System.out.println(year + " not Leap Year.");
		        }
		    }
		

}
