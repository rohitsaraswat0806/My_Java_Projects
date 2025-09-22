package Assignment13Encapsulation_Polym_Inter_Abst;
	import java.util.*;

	abstract class FoodItem {
	    private String itemName;
	    private double price;
	    private int quantity;
	    public FoodItem(String itemName, double price, int quantity) {
	        this.itemName = itemName;
	        this.price = price;
	        this.quantity = quantity;
	    }
	    public String getItemName() {
	        return itemName;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    protected void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	
	    public abstract double calculateTotalPrice();

	    public void getItemDetails() {
	        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
	    }
	}
	interface Discountable {
	    double applyDiscount(double totalPrice);
	    void getDiscountDetails();
	}
	class VegItem extends FoodItem implements Discountable {
	    public VegItem(String itemName, double price, int quantity) {
	        super(itemName, price, quantity);
	    }

	 
	    public double calculateTotalPrice() {
	        return getPrice() * getQuantity();
	    }

	   
	    public double applyDiscount(double totalPrice) {
	        return totalPrice * 0.90; // 10% discount
	    }

	   
	    public void getDiscountDetails() {
	        System.out.println("Veg Discount: 10% applied.");
	    }
	}


	class NonVegItem extends FoodItem implements Discountable {
	    private double nonVegCharge = 50; // extra charge per item

	    public NonVegItem(String itemName, double price, int quantity) {
	        super(itemName, price, quantity);
	    }

	    public double calculateTotalPrice() {
	        return (getPrice() + nonVegCharge) * getQuantity();
	    }


	    public double applyDiscount(double totalPrice) {
	        return totalPrice * 0.95; // 5% discount
	    }

	    public void getDiscountDetails() {
	        System.out.println("Non-Veg Discount: 5% applied.");
	    }
	}
	public class Food_Delivery_System {
	    public static void processOrder(List<FoodItem> items) {
	        double grandTotal = 0;

	        for (FoodItem item : items) {
	            item.getItemDetails();
	            double totalPrice = item.calculateTotalPrice();
	            System.out.println("Base Total: " + totalPrice);

	            if (item instanceof Discountable) {
	                Discountable d = (Discountable) item;
	                totalPrice = d.applyDiscount(totalPrice);
	                d.getDiscountDetails();
	            }

	            System.out.println("Final Price after Discount: " + totalPrice);
	            System.out.println("----------------------");
	            grandTotal += totalPrice;
	        }

	        System.out.println("Grand Total for Order: " + grandTotal);
	    }

	    public static void main(String[] args) {
	        List<FoodItem> order = new ArrayList<>();


	        order.add(new VegItem("Paneer Butter Masala", 200, 2));
	        order.add(new NonVegItem("Chicken Biryani", 300, 1));

	       
	        processOrder(order);
	    }
	}