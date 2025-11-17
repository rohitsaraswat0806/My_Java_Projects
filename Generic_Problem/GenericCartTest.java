package Generic_Problem;

	import java.util.ArrayList;
	import java.util.List;
	class Cart<T> {

	    private List<T> items = new ArrayList<>();

	    public void addItem(T item) {
	        items.add(item);
	        System.out.println(item + " added to cart.");
	    }

	    public void removeItem(T item) {
	        items.remove(item);
	        System.out.println(item + " removed from cart.");
	    }

	    public void displayItems() {
	        System.out.println("Cart contains:");
	        for (T item : items) {
	            System.out.println("- " + item);
	        }
	    }
	}

	class Electronics {
	    String name;
	    Electronics(String name) {
	        this.name = name;
	    }
	    public String toString() {
	        return name;
	    }
	}

	class Clothing {
	    String name;
	    Clothing(String name) {
	        this.name = name;
	    }
	    public String toString() {
	        return name;
	    }
	}

	public class GenericCartTest {
	    public static void main(String[] args) {

	       
	        Cart<Electronics> electronicsCart = new Cart<>();
	        electronicsCart.addItem(new Electronics("Laptop"));
	        electronicsCart.addItem(new Electronics("Smartphone"));
	        electronicsCart.displayItems();

	        System.out.println();

	     


}}
