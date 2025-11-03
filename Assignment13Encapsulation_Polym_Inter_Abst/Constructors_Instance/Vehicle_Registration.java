package Constructors_Instance;

public class  Vehicle_Registration{
	    private String o;
	    private String vehicleType;
	    private static double r = 25000.0; 
	    public Vehicle_Registration(String ownerName, String vehicleType) {
	        this.o = ownerName;
	        this.vehicleType = vehicleType;
	    }
	    public void dvd() {
	        System.out.println("Owner Name: " + o);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Registration Fee: " + r);
	    }
	    public static void urf(double newFee) {
	            r = newFee;
	            System.out.println("Registration fee updated to: " + r);
	        }
	    public static void main(String[] args) {
	    	Vehicle_Registration vehicle1 = new Vehicle_Registration("Tarun Thakur", "XUV Car");
	    	Vehicle_Registration vehicle2 = new Vehicle_Registration("Keshvi Goyal", "Car");
	        System.out.println("Initial Vehicle Details");
	        vehicle1.dvd();
	        System.out.println(" ");
	        vehicle2.dvd();
	        System.out.println("");
	        Vehicle_Registration.urf(750.0);
	        vehicle1.dvd();
	        System.out.println(" ");
	        vehicle2.dvd();
	        System.out.println(" ");
	        Vehicle_Registration.urf(-100.0);
	    }
	}
