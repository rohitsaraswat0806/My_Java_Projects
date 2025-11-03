package Constructors_Instance;
public class Car_Rental_System{
	    private String cn;
	    private String cm;
	    private int rd;
	    private double totalCost;
	    private static final double DAILY_RATE = 150000.0;
	    public Car_Rental_System(String customerName, String carModel, int rentalDays) {
	        this.cn = customerName;
	        this.cm = carModel;
	        this.rd = rentalDays;
	        this.totalCost = calculateTotalCost();
	    }
	    private double calculateTotalCost() {
	        return rd * DAILY_RATE;
	    }
	    public String getCustomerName() {
	        return cn;
	    }

	    public String getCarModel() {
	        return cm;
	    }

	    public int getRentalDays() {
	        return rd;
	    }

	    public double getTotalCost() {
	        return totalCost;
	    }
	    public void displayRentalDetails() {
	        System.out.println("Customer Name: " + cn);
	        System.out.println("Car Model: " + cm);
	        System.out.println("Rental Days: " + rd);
	        System.out.println("Total Cost: " + String.format("%.2f", totalCost));
	    }
	    public static void main(String[] args) {
	    	Car_Rental_System rental1 = new Car_Rental_System("Rohit Saraswat", "Tata safari", 90);
	        rental1.displayRentalDetails();
	        Car_Rental_System rental2 = new Car_Rental_System("Himanshu Yadav", "VW vitrus ", 90);
	        rental2.displayRentalDetails();
	    }
	}