package Constructors_Instance;
public class book_detail {
	    private String title;
	    private String author;
	    private double price;
	    public book_detail() {
	        this.title = "love my life";
	        this.author = "Arjit Singh";
	        this.price = 6969.0;
	    }
	    public book_detail(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }
	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	    public static void main(String[] args) {
	        book_detail book1 = new book_detail();
	        System.out.println("Book 1 (Default):");
	        System.out.println("Title: " + book1.getTitle());
	        System.out.println("Author: " + book1.getAuthor());
	        System.out.println("Price: " + book1.getPrice());
	        System.out.println();
	        book_detail book2 = new book_detail("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 12.99);
	        System.out.println("Book 2 (Parameterized):");
	        System.out.println("Title: " + book2.getTitle());
	        System.out.println("Author: " + book2.getAuthor());
	        System.out.println("Price: " + book2.getPrice());
	    }
	}