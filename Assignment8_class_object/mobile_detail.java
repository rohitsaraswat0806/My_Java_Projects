package Assignment8_class_object;

public class mobile_detail {

	    public static void main(String[] args) {
	       
	        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15 Pro", 1099.00);


	        phone1.displayDetails();

	        System.out.println(); 

	        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24 Ultra", 1250.50);
	        phone2.displayDetails();
	    }
	}

	class MobilePhone {
	    String brand;
	    String model;
	    double price;

	    public MobilePhone(String phoneBrand, String phoneModel, double phonePrice) {
	        this.brand = phoneBrand;
	        this.model = phoneModel;
	        this.price = phonePrice;
	    }
	    public void displayDetails() {
	        System.out.println("--- Phone Details ---");
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: $" + String.format("%.2f", price));
	    }
	}



