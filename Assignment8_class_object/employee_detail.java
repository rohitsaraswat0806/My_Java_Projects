package Assignment8_class_object;

public class employee_detail {
	    public static void main(String[] args) {
	  
	        Employee employee1 = new Employee("Jane Doe", 101, 75000.00);
	        System.out.println("Employee 1 Details");
	        employee1.displayDetails();
	        Employee employee2 = new Employee("John Smith", 102, 82500.50);

	        System.out.println("\nEmployee 2 Details");
	        employee2.displayDetails();
	    }
	}
	 class Employee {
	    String name;
	    int id;
	    double salary;
	    public Employee(String empName, int empId, double empSalary) {
	     
	        this.name = empName;
	        this.id = empId;
	        this.salary = empSalary;
	    }

	    public void displayDetails() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: $" + salary);
	    }
	}



