package Constructors_Instance;
public class  Book_Library_System{
	    public String ISBN;
	    protected String title;
	    private String author;

	    public Book_Library_System(String ISBN, String title, String author) {
	        this.ISBN = ISBN;
	        this.title = title;
	        this.author = author;
	    }
	    public void setAuthor(String author) {
	        this.author = author;
	    }
	    public String getAuthor() {
	        return this.author;
	    }

	    public void displayBookDetails() {
	        System.out.println("ISBN: " + ISBN);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + getAuthor());
	    }
	}