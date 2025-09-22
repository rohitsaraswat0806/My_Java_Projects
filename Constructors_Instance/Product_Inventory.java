package Constructors_Instance;
public class Product_Inventory {
	    private String pn;
	    private double p;
	    private static int tp = 0;
	    public Product_Inventory(String productName, double price) {
	        this.pn = productName;
	        this.p = price;
	        tp++; 
	    }
	    public void dpd() {
	        System.out.println("Product Name: " + this.pn);
	        System.out.println("Price: " + this.p);
	    }
	    public static void displayTotalProducts() {
	        System.out.println("Total number of products " + tp);
	    }
	    public static void main(String[] args) {
	    	Product_Inventory product1 = new Product_Inventory("Laptop", 1500.00);
	    	Product_Inventory product2 = new Product_Inventory("Mouse", 30.50);
	    	Product_Inventory product3 = new Product_Inventory("Keyboard", 85.00);
	        System.out.println("Product 1 ");
	        product1.dpd();
	        System.out.println("\nProduct 2 ");
	        product2.dpd();
	        System.out.println("\nProduct 3 ");
	        product3.dpd();
	        System.out.println();
	        Product_Inventory.displayTotalProducts(); 
	    }
	}