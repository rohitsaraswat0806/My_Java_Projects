package Exception;
import java.util.*;
import java.util.Scanner;


class InvalidCredentialsException extends Exception {
 public InvalidCredentialsException(String message) {
     super(message);
 }
}


class Login {
 private final String validUsername = "admin";
 private final String validPassword = "password123";

 public void validate(String user, String pass) throws InvalidCredentialsException {
     if (!user.equals(validUsername) || !pass.equals(validPassword)) {
         throw new InvalidCredentialsException("Invalid username or password.");
     }
 }
}

public class login_system {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Login login = new Login();

     while (true) {
         System.out.print("Enter username: ");
         String username = scanner.nextLine();

         System.out.print("Enter password: ");
         String password = scanner.nextLine();

         try {
             login.validate(username, password);
             System.out.println("Login successful!");
             break; 
             } catch (InvalidCredentialsException e) {
             System.out.println(e.getMessage() + " Please try again.");
         }
     }

     scanner.close();
 }
}

