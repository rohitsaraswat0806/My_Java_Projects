package Assignment8_class_object;
public class Circle_area_circum {
    public static void main(String[] args) {
        CircleDetails myCircle = new CircleDetails(5.0);
        System.out.println(" Circle Details ");
        myCircle.displayDetails();
        CircleDetails anotherCircle = new CircleDetails(12.5);

        System.out.println("\n Another Circle's Details ");
        anotherCircle.displayDetails();
    }
}
class CircleDetails {

    double radius;

    public CircleDetails(double r) {
       
        this.radius = r;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}
