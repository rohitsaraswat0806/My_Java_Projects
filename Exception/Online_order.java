package Exception;
import java.util.Random;
	class OutOfStockException extends Exception {
	    public OutOfStockException(String message) {
	        super(message);  }}
	class PaymentFailedException extends Exception {
	    public PaymentFailedException(String message) {
	        super(message);   }}
	class OrderService {    
	    private Random random;
	    public OrderService() {
	        this.random = new Random();	    }
	    public void placeOrder(String product) throws OutOfStockException, PaymentFailedException {
	        int simulation = random.nextInt(3); 
	        switch (simulation) {
	            case 0:
	                System.out.println("Order placed successfully for: " + product);
	                break;
	            case 1:	               
	                throw new OutOfStockException("Sorry, " + product + " is currently out of stock.");
	            case 2:	                
	                throw new PaymentFailedException("Payment failed. Please check your card details and try again.");	        }	    }	}
	public class Online_order {
	    public static void main(String[] args) {
	        OrderService orderService = new OrderService();	        
	        String[] itemsToOrder = {"Smartphone", "Laptop Case", "Headphones", "Coffee Mug"};
	        System.out.println("--- Starting Online Order Simulation ---");
	        for (String item : itemsToOrder) {
	            System.out.println("\nAttempting to order: " + item);	            
	            try {
	                orderService.placeOrder(item);
	            } catch (OutOfStockException e) {	             
	                System.out.println("Order Update: " + e.getMessage());
	            } catch (PaymentFailedException e) {	               
	                System.out.println("Order Update: " + e.getMessage());	            }	            
	            System.out.println("--------------------------------------");	        }	        
	        System.out.println("\n--- Simulation Finished ---");    	}}
