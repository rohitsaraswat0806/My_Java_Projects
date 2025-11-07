package Exception;
import java.util.Scanner;
class InvalidTemperatureException extends Exception {
 public InvalidTemperatureException(String message) {
     super(message);
 }
}


class TemperatureConverter {
 public static double toFahrenheit(double celsius) throws InvalidTemperatureException {
     if (celsius < -273.15) {
         throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
     }
     return (celsius * 9 / 5) + 32;
 }

 public static double toCelsius(double fahrenheit) throws InvalidTemperatureException {
     if (fahrenheit < -459.67) {
         throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
     }
     return (fahrenheit - 32) * 5 / 9;
 }
}


public class temperature{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter temperature value: ");
     double temperature = scanner.nextDouble();

     System.out.print("Enter unit (C or F): ");
     String unit = scanner.next().toUpperCase();

     try {
         if (unit.equals("C")) {
             double fahrenheit = TemperatureConverter.toFahrenheit(temperature);
             System.out.printf("%.2f°C = %.2f°F%n", temperature, fahrenheit);
         } else if (unit.equals("F")) {
             double celsius = TemperatureConverter.toCelsius(temperature);
             System.out.printf("%.2f°F = %.2f°C%n", temperature, celsius);
         } else {
             System.out.println("Invalid unit! Please enter C or F.");
         }
     } catch (InvalidTemperatureException e) {
         System.out.println("Error: " + e.getMessage());
     }

     scanner.close();
 }
}

 