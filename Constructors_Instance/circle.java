package Constructors_Instance;
public class circle {
	    private double radius;
	    public circle() {
	        this(1.0); 
	    }
	    public circle(double radius) {
	        if (radius >= 0) { 
	            this.radius = radius;
	        } else {
	            System.out.println("Radius cannot be negative.");
	            this.radius = 1.0;
	        }
	    }
	    public double getRadius() {
	        return radius;
	    }
	    public void setRadius(double radius) {
	        if (radius >= 0) {
	            this.radius = radius;
	        } else {
	            System.out.println("Radius cannot be negative.");
	        }
	    }
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }

	    public static void main(String[] args) {
	        circle defaultCircle = new circle();
	        System.out.println("Default Circle Radius: " + defaultCircle.getRadius());
	        System.out.println("Default Circle Area: " + defaultCircle.calculateArea());
	        circle customCircle = new circle(5.0);
	        System.out.println("\nCustom Circle Radius: " + customCircle.getRadius());
	        System.out.println("Custom Circle Area: " + customCircle.calculateArea());
	        circle invalidCircle = new circle(-2.0);
	        System.out.println("\nInvalid Circle Radius (should be default): " + invalidCircle.getRadius());
	    }
	}