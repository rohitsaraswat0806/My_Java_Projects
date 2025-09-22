package Constructors_Instance;
public class Employee_Records {
	    public String employeeId;
	    protected String department;
	    private double salary;
	    public  Employee_Records(String employeeId, String department, double salary) {
	        this.employeeId = employeeId;
	        this.department = department;
	        this.salary = salary;
	    }
	    public void modifySalary(double newSalary) {
	        if (newSalary >= 0) {
	            this.salary = newSalary;
	            System.out.println("Salary for " + employeeId + " updated to: " + newSalary);
	        } else {
	            System.out.println("Invalid salary value. Salary must be non-negative.");
	        }
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	    }
	}
	class Manager extends  Employee_Records {
	    private String teamManaged;
	    public Manager(String employeeId, String department, double salary, String teamManaged) {
	        super(employeeId, department, salary);
	        this.teamManaged = teamManaged;
	    }
	    public void displayManagerDetails() {
	        System.out.println("Manager ID: " + employeeId);
	        System.out.println("Manager Department: " + department);
	        System.out.println("Team Managed: " + teamManaged);
	        System.out.println("Manager Salary (via getter): " + getSalary()); 
	    }
	    public void modifySalary(double newSalary) {
	        System.out.println("Manager-specific salary modification logic applied.");
	        super.modifySalary(newSalary); 
	    }
		public class Main{
	    public static void main (String[] args) {
	    	 Employee_Records emp1 = new Employee_Records("E001", "HR", 60000.0);
	        emp1.displayEmployeeDetails();
	        emp1.modifySalary(65000.0);
	        emp1.displayEmployeeDetails();
	        System.out.println("\n--- Manager Details ---");
	        Manager mgr1 = new Manager("M001", "Sales", 90000.0, "North Region Sales");
	        mgr1.displayManagerDetails();
	        mgr1.modifySalary(95000.0); 
	        mgr1.displayManagerDetails();
	        System.out.println("\nAccessing public field from Main: " + emp1.employeeId);
	    }
		}
	}
	