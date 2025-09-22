package Assignment8_class_object;
import java.util.Scanner;
public class book_details {

		    String title;
		    String author;
		    double price;
		    public book_details(String title, String author, double price) {
		        this.title = title;
		        this.author = author;
		        this.price = price;
		    }
		    public void play() {
		        System.out.println("Book Details:");
		        System.out.println("Title: " + this.title);
		        System.out.println("Author: " + this.author);
		        System.out.println("Price: $" + String.format("%.2f", this.price)); 
		        }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter book title: ");
		        String title = scanner.nextLine();

		        System.out.print("Enter book author: ");
		        String author = scanner.nextLine();

		        System.out.print("Enter book price: ");
		        double price = scanner.nextDouble();
		        book_details myBook = new book_details(title, author, price);
		        myBook.play();
		    }
		}


